import Tests.LoginServiceValidation;
import Tests.UserPasswordValidation;

public class AuthenticationTestRunner {

    public static void main(String[] args) {
        UserPasswordValidation ups = new UserPasswordValidation();
        ups.testBlankOrEmptyUserPassword();
        ups.testNullUserPassword();
        ups.testUserPassword1();
        ups.testUserPassword2();

        LoginServiceValidation lsv = new LoginServiceValidation();
        lsv.testValidUserLogin();
        lsv.testNullUserLogin();
        lsv.testInvalidUserLogin();
    }

}
