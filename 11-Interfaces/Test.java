public class Test {
    public static void main (String[] args) {
        TV tv = new TV();

        tv.on();
        tv.status();
        
        tv.setChannel(15);
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.status();

        tv.displayChannels();

        tv.setChannel(5);
        tv.status();

        tv.off();
        tv.status();
    }
}