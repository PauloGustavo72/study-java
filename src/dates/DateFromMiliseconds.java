package dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFromMiliseconds {

    public static void main(String[] args) {
        // milliseconds
        long milliSec = 3010;

        DateFormat simple = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS Z");

        Date result = new Date(milliSec);

        System.out.println(simple.format(result));

    }
}
