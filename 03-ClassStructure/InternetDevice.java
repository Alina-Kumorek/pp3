// 15.	There are many devices that can use the Internet:
// a personal computer, laptop, tablet, smartphone, internet radio or TV.
// Define an InternetDevice class to describe such devices.
// The class should contain attributes: name (device name),
// connected (whether a device is connected to the Internet),
// and connectedDevices (the number of connected devices - static field).
// Add a constructor InternetDevice(name) and methods for device manipulation:
// connect(), disconnect(), isConnected(), displayStatus(), displayConnections() (static method).
// Then write a program that creates five different internet devices,
// three of which are connected to the Internet.
// Display the status of each device and information about the number of devices connected to the Internet.

public class InternetDevice {
    private static int connectedDevices = 0;

    private String name;
    private boolean connected;

    public InternetDevice(String name) {
        this.name = name;
        connected = false;
    }

    public boolean isConnected() {
        return connected;
    }

    public void connect() {
        if (! isConnected()) {
            connected = true;
            InternetDevice.connectedDevices++;
        }
    }

    public void disconnect() {
        if (isConnected()) {
            connected = false;
            InternetDevice.connectedDevices--;
        }
    }

    public void displayStatus() {
        System.out.println("Name:\t" + name);
        String status = isConnected() ? "connected" : "disconnected";
        System.out.println("Status:\t" + status);
        System.out.println("-----");
    }

    public static void displayConnections() {
        System.out.println("Number of connections:\t" + InternetDevice.connectedDevices);
        System.out.println("-----");
    }
}