public class InternetDeviceTest {
    public static void main (String[] args) {
        InternetDevice d1 = new InternetDevice("PC");
        d1.connect();
        InternetDevice d2 = new InternetDevice("laptop");
        d2.connect();
        InternetDevice d3 = new InternetDevice("tablet");
        InternetDevice d4 = new InternetDevice("smartphone");
        d4.connect();
        InternetDevice d5 = new InternetDevice("TV");

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
        d4.displayStatus();
        d5.displayStatus();

        InternetDevice.displayConnections();
    }
}