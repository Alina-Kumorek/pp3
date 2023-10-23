// 24.	Variables ‘hours’ and ‘minutes’ contain the number of hours and minutes that have passed since midnight.
// Write a program that displays the given time (in the format hh:mm – you can use printf() method)
// and calculates and displays the number of minutes and the number of seconds that have passed since midnight.

import java.util.Calendar;

public class Time {
    public static void main(String[] args) {
        // Prawdopodobnie nie mieliśmy użyć aktualnego czasu...
        Calendar c = Calendar.getInstance();

        int hours = c.get(Calendar.HOUR_OF_DAY);
        int minutes = c.get(Calendar.MINUTE);
        int seconds = c.get(Calendar.SECOND);

        System.out.printf("hours = %d\n", hours);
        System.out.printf("minutes = %d\n", minutes);
        System.out.printf("minutes from midnight: %d\n", hours*60+minutes);
        System.out.printf("seconds from midnight: %d\n", hours*3600+minutes*60+seconds);
    }
}
