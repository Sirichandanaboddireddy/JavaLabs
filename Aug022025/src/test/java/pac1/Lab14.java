package pac1;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Lab14 {

    public static void printDateTimeForZone(String zoneIdStr) {
        try {
            ZoneId zoneId = ZoneId.of(zoneIdStr);
            ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

            System.out.println("Current date and time in " + zoneIdStr + ": " + zonedDateTime.format(formatter));
        } catch (Exception e) {
            System.out.println("Invalid Zone ID: " + zoneIdStr);
        }
    }

    public static void main(String[] args) {
        
        printDateTimeForZone("America/New_York");
        printDateTimeForZone("Europe/London");
        printDateTimeForZone("Asia/Tokyo");
        printDateTimeForZone("US/Pacific");
        printDateTimeForZone("Africa/Cairo");
        printDateTimeForZone("Australia/Sydney");
        
        
        printDateTimeForZone("Invalid/Zone");
    }
}
