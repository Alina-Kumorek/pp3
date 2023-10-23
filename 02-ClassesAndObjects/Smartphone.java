// 25.	Specify at least five attributes and three behaviors for the objects:
//     a.	Smartphone
// Then, in separate files, create classes representing above objects. Define attributes and methods.
// Do not create a main method, just classes with their attributes and empty methods.
// After that, compile both classes to check whether their syntax is correct.
// Finally, display list of class attributes and methods in the VSCode (OUTLINE panel).

public class Smartphone {
    boolean isOn = false;
    int battery = 50;
    int volume = 15;
    String phoneNumber = "123123123";

    void turnOn() {
        if (battery > 0) {
            isOn = true;
        }
    }

    void turnOff() {
        isOn = false;
    }

    void useBattery(int amount) {
        if (battery > amount) {
            battery -= amount;
        } else {
            battery = 0;
            turnOff();
        }
    }

    void charge () {
        battery = 100;
    }
}
