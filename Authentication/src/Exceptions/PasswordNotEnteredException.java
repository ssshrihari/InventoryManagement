package Exceptions;

public class PasswordNotEnteredException extends Throwable {
    public  PasswordNotEnteredException(){

    }
    @Override
    public String getMessage() {
        return "Password is Empty or Blank";
    }
}
