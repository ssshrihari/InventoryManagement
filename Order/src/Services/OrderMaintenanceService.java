package Services;

import Dao.OrderDao;
import Exceptions.CreateOrderFailedException;
import Exceptions.OrderSaveFailedException;
import Models.Customer;
import Models.Order;
import Models.Product;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import Logger.MyFormatter;
import Logger.MyFilter;
public class OrderMaintenanceService {
    static Logger logger = Logger.getLogger(OrderMaintenanceService.class.getName());
    public void CreateOrder(Customer customer, Product product){
        try {
            Handler fileHandler = new FileHandler("Orders.log", 2000, 5);
            logger.addHandler(fileHandler);
            fileHandler.setFormatter(new MyFormatter());
            fileHandler.setFilter(new MyFilter());
            logger.log(Level.INFO, "Create Order Service Begin");
            Order order = new Order(product, customer);
            OrderDao orderDao = new OrderDao();
            orderDao.saveOrder(order);
        }catch(CreateOrderFailedException e){
            logger.log(Level.INFO, "Create Order Service Failed");
        }
        catch (OrderSaveFailedException e){
            logger.log(Level.INFO, "Save Order Failed");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            logger.log(Level.INFO, "Create Order Service End");
        }
    }
}
