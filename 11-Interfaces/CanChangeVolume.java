// 11.	An important functionality of each TV set is the volume control.
// Create a CanChangeVolume interface that contains the methods for changing the volume level: volumeUp(), volumeDown().

interface CanChangeVolume {
    public static final int MIN_VOLUME = 1;
    public static final int MAX_VOLUME = 10;

    public void volumeUp();
    public void volumeDown();
}