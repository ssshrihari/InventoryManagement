package Services;

import Models.User;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import Logger.MyFilter;
import Logger.MyFormatter;
public class LoginService {
    static Logger logger = Logger.getLogger(LoginService.class.getName());
    private boolean isLoggedIn = false;
    public  void Login(User user){
         try{
             Handler fileHandler = new FileHandler("Authentication.log", 2000, 5);
             logger.addHandler(fileHandler);
             fileHandler.setFilter(new MyFilter());
             fileHandler.setFormatter(new MyFormatter());
             logger.log(Level.INFO, "Login Service Begin");
             UserMaintenanceService usm = new UserMaintenanceService();
             if(usm.isPasswordValid(user)){
                    isLoggedIn = true;
                 logger.log(Level.INFO, "Login Successfully done");
             }
         }catch (Exception e)
         {
             logger.log(Level.SEVERE, "Invalid User" + e.getMessage());
         }
         finally {
             logger.log(Level.INFO, "Login Service End");
         }

    }
    public Boolean getLoginStatus(){
        return isLoggedIn;
    }

}
