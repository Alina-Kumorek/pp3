// 9.	In addition to switching on and off, TV sets also allow you to change the number of the displayed channel.
// Create a CanChangeChannel interface which contains the methods for changing the channel:
// channelUp(), channelDown(), setChannel(channelNo).

interface CanChangeChannel {
    public static final int MIN_CHANNEL = 1;
    public static final int MAX_CHANNEL = 99;

    public void channelUp();
    public void channelDown();
    public void setChannel(int channelNo);
}