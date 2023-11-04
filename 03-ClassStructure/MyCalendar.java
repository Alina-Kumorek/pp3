// 6.	Define a class MyCalendar with three static integer fields: year, month and day. Then, create:
//     a.	Method myDate() that returns the date as a string, in the format yyyy-mm-dd
//     b.	Method days() that returns the number of days passed from the beginning of year.
//     c.	Method monthName() the returns a string with the month name
// Finally, display calculated values. Sample result.

// Date: 2023-04-09
// Days from the beginning of year: …
// Month name: April 

public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;

    static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 30};
    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /*
     * Returns date
     * in the form yyyy-mm-dd
     */
    static String myDate(){
        return String.format("%04d-%02d-%02d", MyCalendar.year, MyCalendar.month, MyCalendar.day);
    }

    /*
     * Returns the number of days
     * from the beginning of year
     */
    static int days() {
        int d = MyCalendar.day;

        for (int i = 0; i < MyCalendar.month - 1; i++) {
            d += MyCalendar.days[i];
        }

        return d;
    }

    /*
     * Returns month name
     */
    static String monthName() {
        return MyCalendar.months[MyCalendar.month - 1];
    }
}
