package Tests;

import Models.User;
import Services.UserMaintenanceService;

public class UserPasswordValidation {
    public void testBlankOrEmptyUserPassword(){
        UserMaintenanceService userMaintenanceService = new UserMaintenanceService();
        User user = new User("");
        if(userMaintenanceService.isPasswordValid(user))
            System.out.println("testBlankOrEmptyUserPassword Test Failed");
        else
            System.out.println("testBlankOrEmptyUserPassword Test passed");
    }
    public void testNullUserPassword(){
        UserMaintenanceService userMaintenanceService = new UserMaintenanceService();
        if(userMaintenanceService.isPasswordValid(null))
            System.out.println("testNullUserPassword Test Failed");
        else
             System.out.println("testNullUserPassword Test passed");

    }
    public void testUserPassword1(){
        UserMaintenanceService userMaintenanceService = new UserMaintenanceService();
        User user = new User("Admin123");
        if(userMaintenanceService.isPasswordValid(user))
        System.out.println("testUserPassword1 Test passed");
        else
        System.out.println("testUserPassword1 Test Failed");
    }
    public void testUserPassword2(){
        UserMaintenanceService userMaintenanceService = new UserMaintenanceService();
        User user = new User("Admin");
        if(userMaintenanceService.isPasswordValid(user))
            System.out.println("testUserPassword2 Test Failed");
        else
            System.out.println("testUserPassword2 Test passed");
    }
}
