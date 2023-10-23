// 27.	Define a class for describing lamps. Then, define the following object attributes and behaviors:
//     a.	attributes: whether a lamp is on
//     b.	behaviors:
//         (1) switch on the lamp,
//         (2) switch off the lamp,
//         (3) display information whether the lamp is on or off (use ?: operator)
// After that, create two lamps, switch on the first one and switch off the second one.
// Display information whether the lamps are on or off.

public class LampTest {
    public static void main(String[] args) {
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();

        l1.switchOn();
        l2.switchOff();

        l1.displayInfo();
        l2.displayInfo();
    }
}