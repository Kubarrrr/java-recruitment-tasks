import java.lang.reflect.Array;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Zad4 {

    static public Duration dateDifference(String timeA, String timeB) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("h:mma", Locale.ENGLISH);

        LocalTime normalTimeA = LocalTime.parse(timeA.toUpperCase(),dateTimeFormatter);
        LocalTime normalTimeB = LocalTime.parse(timeB.toUpperCase(),dateTimeFormatter);

        Duration resultTime = Duration.between(normalTimeA,normalTimeB);
        return resultTime;
    }


    public static void main(String[] args) {
        Duration res = dateDifference("9:00am","10:00am");

        System.out.println(res.toMinutes());

    }
}
