package Services;

import Dao.UserDao;
import Exceptions.PasswordNotEnteredException;
import Models.User;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import Logger.MyFilter;
import Logger.MyFormatter;

public class UserMaintenanceService {
    static Logger logger = Logger.getLogger(UserMaintenanceService.class.getName());
        public boolean isPasswordValid(User user){
            String password = "Admin123";
            try  {
                Handler fileHandler = new FileHandler("Authentication.log", 2000, 5);
                logger.addHandler(fileHandler);
                fileHandler.setFormatter(new MyFormatter());
                fileHandler.setFilter(new MyFilter());
                logger.log(Level.INFO, "Login Service Begin");
                if(user == null)
                    throw new NullPointerException();
                if(user.password.isBlank() || user.password.isEmpty())
                    throw new PasswordNotEnteredException();
                if(password.equals(user.password))
                    return true;
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Password Validation Complete: Invalid Password " + e.getMessage());
                return false;
            } catch (PasswordNotEnteredException e) {
                logger.log(Level.SEVERE, "Password Validation Complete:"+ e.getMessage());
                return false;
            }
            finally {
                logger.log(Level.INFO, "Password Validation Complete");
            }
            return false;
        }
}
