public class ClockTest {
    public static void main(String[] args) {
        Ex20();
    }

    static void Ex19() {
        Clock c = new Clock(12, 47);
        c.displayTime();
        c.setClock(18, 14);
        c.displayTime();
        c.setClock(9, 3);
        c.displayTime();
        c.setClock(23, 58);
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
    }

    static void Ex20() {
        Clock c = new Clock(5, 59);
        c.setAlarm(6, 0);
        c.addOneMinute();
        c.displayTime();
    }
}
