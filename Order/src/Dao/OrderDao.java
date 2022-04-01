package Dao;

import Exceptions.CreateOrderFailedException;
import Exceptions.OrderSaveFailedException;
import Models.Customer;
import Models.Order;
import Models.Product;

import java.io.*;

public class OrderDao {
    public void saveOrder(Order order) throws OrderSaveFailedException {
        try( FileWriter fw = new FileWriter("DB/src/Orders.txt", true)) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(order.toString());
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new OrderSaveFailedException();
        }
    }
    public Order getOrder(String OrderID) {
        try (FileReader fr = new FileReader("DB/src/Orders.txt")) {
            BufferedReader br = new BufferedReader(fr);
            String s;
            String[] words;
            while ((s = br.readLine()) != null)   //Reading Content from the file
            {
                words = s.split(" ");  //Split the word using space
                for (String word : words) {
                    if (word.equals(OrderID))   //Search for the given word
                    {
                        return constructOrder(s);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
        public Order constructOrder (String rawOrder){
            String[] deserializedOrder = rawOrder.split("\\s+");
            try{
                return new Order(deserializedOrder[0], deserializedOrder[1], new Product(deserializedOrder[2]), new Customer(deserializedOrder[3]));
            }
            catch (CreateOrderFailedException ex){

            }
            return null;
        }


}
