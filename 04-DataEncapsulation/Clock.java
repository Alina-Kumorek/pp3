// 22.	Define a Clock class that allows you to create clocks.
// The class has two integer (int) attributes: hour and minute.
// The hour attribute can take values from 0 to 23, and the minute attribute can take values from 0 to 59.
// The constructor of this class, containing the parameters (int hour, int minute),
// allows you to initialize the clock with the given values of hours and minutes.
// The class also has an addMinute() method that moves the clock forward one minute.
// Apply data encapsulation. For the hour and minute attributes, define access and modification methods.

public class Clock {
    private static int maxHour = 24;
    private static int maxMinute = 60;
    private int hour;
    private int minute;

    public Clock(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
    
    public void setHour(int hour) {
        if (hour >= 0 && hour < Clock.maxHour) {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < Clock.maxMinute) {
            this.minute = minute;
        }
    }

    public void displayTime() {
        System.out.printf("Curent time is:\t %02d:%02d\n", hour, minute);
    }

    void addMinute() {
        minute += 1;

        while (minute >= Clock.maxMinute) {
            minute -= Clock.maxMinute;
            hour += 1;
        }
        setMinute(minute);

        while (hour >= Clock.maxHour) {
            hour -= Clock.maxHour;
        }
        setHour(hour);
    }
}
