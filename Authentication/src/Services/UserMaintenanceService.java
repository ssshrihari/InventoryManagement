package Services;

import Dao.UserDao;
import Exceptions.PasswordNotEnteredException;
import Models.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UserMaintenanceService {

    private final Logger LOGGER = Logger.getLogger(String.valueOf(UserDao.class));
        public boolean isUserValid(User user){
            String password = "Admin123";
            try  {
                LOGGER.log(Level.INFO, "Password Validation Begin");
                if(user == null)
                    throw new NullPointerException();
                if(user.password.isBlank() || user.password.isEmpty())
                    throw new PasswordNotEnteredException();
                if(password.equals(user.password))
                    return true;
            } catch (Exception e) {
                LOGGER.log(Level.INFO, "Password Validation Complete: Invalid Password" + e.getMessage());
                return false;
            } catch (PasswordNotEnteredException e) {
                LOGGER.log(Level.INFO, "Password Validation Complete: Password Empty"+ e.getMessage());
                return false;
            }
            return false;
        }
}
