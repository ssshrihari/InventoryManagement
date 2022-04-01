package Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDate {

    public LocalDateTime getDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        return LocalDateTime.now();
    }
}
