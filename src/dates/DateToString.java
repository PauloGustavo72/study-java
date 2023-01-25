package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateToString {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.JANUARY, 24);
        Date date = calendar.getTime();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy'T'HH:mm:ssXXX");
        TimeZone timeZone = TimeZone.getTimeZone("US/Arizona");
        simpleDateFormat.setTimeZone(timeZone);
        String dateFormated = simpleDateFormat.format(date);

        System.out.println(dateFormated); // 24/01/2023T07:06:23-07:00


    }
}
