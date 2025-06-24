package Level1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZonesAndDate {
    public static void main(String[] args){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("time in IST :" + ist.format(formatter));

        System.out.println("time in GMT :" + gmt.format(formatter));

        System.out.println("time in PST :" + pst.format(formatter));

    }
}
