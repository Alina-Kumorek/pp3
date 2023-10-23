public class Lamp {
    boolean isOn;

    void switchOn() {
        isOn = true;
    }

    void switchOff() {
        isOn = false;
    }

    void displayInfo() {
        String status = isOn ? "on" : "off";
        System.out.printf("The lamp is %s.\n", status);
    }
}
