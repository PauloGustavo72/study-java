package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringToDate {

    public static void main(String[] args) throws ParseException {

        String date = "24/01/2023";
        Locale brlLocale = new Locale("pt", "BR");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", brlLocale);

        Date date1 = simpleDateFormat.parse(date);

        System.out.println(date1.toString()); // Tue Jan 24 00:00:00 BRT 2023

    }
}
