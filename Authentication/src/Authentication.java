import Tests.UserPasswordValidation;

public class Authentication {

    public static void main(String[] args) {
        UserPasswordValidation ups = new UserPasswordValidation();
        ups.testBlankOrEmptyUserPassword();
        ups.testNullUserPassword();
        ups.testUserPassword1();
        ups.testUserPassword2();
    }

}
