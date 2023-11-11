// 19.	Define a class Clock that represents a digital clock. It has two attributes: hour and minute.
// The hour value ranges from 0 to 23. The minute value ranges from 0 to 59. Next, define the following constructors:
//     a.	Clock() – initialises clock to 00:00
//     b.	Clock(hour,minute) – initialises clock to hour:minute
// Then, define methods:
//     c.	setClock(hour,minute)
//     d.	setClock() - reset clock to 00:00
//     e.	displayTime()
//     f.	addOneMinute()
// After that, write a program that:
//     g.	creates a clock with starting time 12:47
//     h.	displays time
//     i.	sets a clock to 18:14
//     j.	displays time
//     k.	sets a clock to 09:03
//     l.	displays time
//     m.	sets a clock to 23:58
//     n.	displays time
//     o.	adds one minute
//     p.	displays time
//     q.	adds one minute
//     r.	displays time

// 20.	Add an alarm function to the created digital clock. Complete the class definition with the attributes:
// alarmHour, alarmMinute. Add methods: setAlarm(hour, minute) and runAlarm(),
// which displays the "beep-beep-beep-beep !!" alarm sound.
// Turn on the alarm when the alarm time is the same as the clock time(compare times in the addOneMinute() method).

public class Clock {
    private static int maxHour = 24;
    private static int maxMinute = 60;
    private int hour;
    private int minute;
    private int alarmHour;
    private int alarmMinute;

    Clock() {
        setClock();
    }

    Clock(int hour, int minute) {
        setClock(hour, minute);
    }

    void setClock(int hour, int minute) {
        if (hour >= 0 && hour < Clock.maxHour && minute >= 0 && minute < Clock.maxMinute) {
            this.hour = hour;
            this.minute = minute;
        } else {
            System.out.println("Inwalid time!");
        }
    }

    void setClock() {
        setClock(0, 0);
    }

    void displayTime() {
        System.out.printf("Curent time is:\t %02d:%02d\n", hour, minute);
    }

    void addOneMinute() {
        minute += 1;
        while (minute >= Clock.maxMinute) {
            minute -= Clock.maxMinute;
            hour += 1;
        }
        while (hour >= Clock.maxHour) {
            hour -= Clock.maxHour;
        }

        setClock(hour, minute);

        if (hour == alarmHour && minute == alarmMinute) {
            runAlarm();
        }
    }

    void setAlarm(int hour, int minute) {
        if (hour >= 0 && hour < Clock.maxHour && minute >= 0 && minute < Clock.maxMinute) {
            this.alarmHour = hour;
            this.alarmMinute = minute;
        } else {
            System.out.println("Inwalid time!");
        }
    }
    
    void runAlarm() {
        System.out.println("beep-beep-beep-beep !!");
    }
}
