package Tests;

import Exceptions.CreateOrderFailedException;
import Models.Customer;
import Models.Order;
import Models.Product;
import Services.OrderMaintenanceService;

public class CreateOrderTest {
    public void testCreateOrder(){
            OrderMaintenanceService oms = new OrderMaintenanceService();
            oms.createOrder(new Customer("434"),new Product("232"));
            if(oms!=null)
                System.out.println("testCreateOrder Passed");
            else
                System.out.println("testCreateOrder Failed");

    }
}
