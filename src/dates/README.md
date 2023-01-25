## Date

### UTC
![Captura de Tela 2023-01-25 às 19 19 34](https://user-images.githubusercontent.com/84418438/214704648-58fdfdf6-3ec0-476a-bf63-529bfa722f43.png)

UTC is the world measure. Like we saw on the image above, if the country is on the left where we are, then we must subtract the hours.
If the country is on the right of us, we must add hours.

<br/>

### What stardards are accepted ?
We can find this [here](https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html).

<br/>

### How do i create a Date from String ?
```java
String date = "24/01/2023";
Locale brlLocale = new Locale("pt", "BR");
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", brlLocale);

Date date1 = simpleDateFormat.parse(date);

System.out.println(date1.toString()); // Tue Jan 24 00:00:00 BRT 2023
```

<br/>

### How do i format a String from Date ?
``` java
Calendar calendar = Calendar.getInstance();
calendar.set(2023, Calendar.JANUARY, 24);
Date date = calendar.getTime();

SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy'T'HH:mm:ssXXX");
TimeZone timeZone = TimeZone.getTimeZone("US/Arizona");
simpleDateFormat.setTimeZone(timeZone);
String dateFormated = simpleDateFormat.format(date);

System.out.println(dateFormated); // 24/01/2023T07:06:23-07:00
```

<br/>

### How do i format a Date from Miliseconds ?
``` java
// milliseconds
long milliSec = 3010;

DateFormat simple = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS Z");

Date result = new Date(milliSec);

System.out.println(simple.format(result)); 
//01 Jan 1970 00:00:03:010 +0000
```

