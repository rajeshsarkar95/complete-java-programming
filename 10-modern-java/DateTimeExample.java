import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();
        System.out.println(today);
        System.out.println(now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
    }
}
