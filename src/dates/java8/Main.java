package dates.java8;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);

        String dateFormatted = localDateTime
                .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                        .withLocale(Locale.getDefault()));


        System.out.println(dateFormatted);
    }
}
