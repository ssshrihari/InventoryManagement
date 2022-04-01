package Tests;

import Dao.OrderDao;
import Models.Order;
import Services.OrderMaintenanceService;

public class GetOrderTest {
    public void testGetInvalidOrder(){
        OrderMaintenanceService o = new OrderMaintenanceService();
        Order got = o.getOrder("-0202");
        if(got!=null){
            System.out.println("testGetInvalidOrder Failed");
        }
        else{
            System.out.println("testGetInvalidOrder Passed");
        }
    }
    public void testGetEmptyOrder(){
        OrderMaintenanceService o = new OrderMaintenanceService();
        Order got = o.getOrder("");
        if(got!=null){
            System.out.println("testGetInvalidOrder Failed");
        }
        else{
            System.out.println("testGetInvalidOrder Passed");
        }
    }
    public void testGetValidOrder(){
        OrderMaintenanceService o = new OrderMaintenanceService();
        Order got = o.getOrder("202204010517532");
        if(got!=null){
        if(got.getOrderID().equals("202204010517532")){
            System.out.println("testGetInvalidOrder Passed");}}
        else
            System.out.println("testGetInvalidOrder Failed");

    }
}
