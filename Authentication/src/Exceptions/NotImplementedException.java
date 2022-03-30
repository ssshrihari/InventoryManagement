package Exceptions;

public class NotImplementedException extends Throwable {
    public NotImplementedException(String todo) {

    }

    @Override
    public String getMessage() {
        return "The Method is not implemented yet";
    }
}
