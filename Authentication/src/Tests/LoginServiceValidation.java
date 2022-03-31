package Tests;

import Models.User;
import Services.LoginService;

public class LoginServiceValidation {
    public void testValidUserLogin(){
        User user = new User("Admin123");
        LoginService loginService = new LoginService();
        loginService.Login(user);
        if(loginService.getLoginStatus())
            System.out.println("testUserLogin Test Passed");
        else
            System.out.println("testUserLogin Test Failed");
    }
    public void testInvalidUserLogin(){
        User user = new User("Admin");
        LoginService loginService = new LoginService();
        loginService.Login(user);
        if(loginService.getLoginStatus())
            System.out.println("testUserLogin Test Failed");
        else
            System.out.println("testUserLogin Test Passed");
    }
    public void testNullUserLogin() {
        LoginService loginService = new LoginService();
        loginService.Login(null);
        if(loginService.getLoginStatus())
            System.out.println("testUserLogin Test Failed");
        else
            System.out.println("testUserLogin Test Passed");
    }
}
