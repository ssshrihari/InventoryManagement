package Models;

import java.time.LocalDateTime;
import Date.MyDate;
import Exceptions.CreateOrderFailedException;
import Exceptions.GetOrderFailedException;

public class Order {
    String orderID;
    String orderDate;
    Product product;
    Customer customer;
    public Order(Product product,Customer customer) throws CreateOrderFailedException {
        this.orderDate = new MyDate().getDate().toString();
        if(product == null || customer == null)
            throw new CreateOrderFailedException();
        this.orderID = this.orderDate+""+product.productID;
        this.product = product;
        this.customer = customer;
    }

    public Order(String orderID,String Date, Product product, Customer customer) throws GetOrderFailedException {
        this.orderDate = new MyDate().getDate().toString();
        this.orderID = orderID;
        if(product == null || customer == null)
            throw new GetOrderFailedException();
        this.product = product;
        this.customer = customer;
    }

    public String getOrderID(){
        return this.orderID;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", orderDate=" + orderDate +
                ", product=" + product +
                ", customer=" + customer +
                '}';
    }
}
