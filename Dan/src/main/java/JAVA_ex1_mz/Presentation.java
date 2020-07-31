package JAVA_ex1_mz;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Presentation {

    public static void  dateNow(){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("LocalDateTime: " + ldt);
        Instant now = Instant.now();
        System.out.println("Instant: " + now);
    }

    public static void tokyoDateTime(){
        // Strefy dokumentacja https://garygregory.wordpress.com/2013/06/18/what-are-the-java-timezone-ids/
        Clock clock = Clock.system(ZoneId.of("Asia/Tokyo"));
        LocalDateTime ldt = LocalDateTime.now(clock);
        System.out.println("Japan time:" + ldt);
    }

    public static void dateFormat(){
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/mm/dd");
        System.out.println("Date in format yyyy/mm/dd: " + formatter.format(ldt));
    }

    public static void main(String[] args){
        dateNow();
        tokyoDateTime();
        dateFormat();
    }
}

