// 7.	A TV class describes TV sets. Each TV can be turned on or off. Define the class with the appropriate attribute.
// Add a method that displays TV status.

// 8.	In the TV class, implement the CanOnOff interface. Define methods by which the TV can be turned on and off.
// Then write a program that:
//     a.	Turns on TV
//     b.	Displays TV status
//     c.	Turns off TV
//     d.	Displays TV status

// 10.	In the TV class, add an attribute that describes the channel number. Then implement the CanChangeChannel interface.
// Define methods in the class for changing the channel. Take into account that:
//     a.	The allowed channel number is 1 through 99.
//     b.	The channel can only be changed when the TV is on.
//     c.	The default channel number after turning on the TV is 1.
//     d.	TV status displays channel number only when the TV is on.
// Then write a program that:
//     e.	Turns on the TV
//     f.	Displays TV status (whether TV is on and channel number)
//     g.	Changes channel number to the next one.
//     h.	Changes channel number to 7.
//     i.	Changes channel number to 142.
//     j.	Displays TV status.
//     k.	Changes channel number to the previous one.
//     l.	Displays TV status.
//     m.	Turns off the TV.
//     n.	Displays TV status.

// 12.	In the TV class, add an attribute that describes the volume level. Then implement the CanChangeVolume interface.
// Define in the class the methods for adjusting the TV volume level. Take into account that:
//     a.	The valid range for the volume level is 1 to 10.
//     b.	The default volume level after turning on the TV is 1.
//     c.	The volume level can only be adjusted when the TV is on.
// Then write a program that:
//     d.	Turns on the TV.
//     e.	Displays TV status (whether TV is on, channel number, volume level)
//     f.	Changes channel number to 15.
//     g.	Sets the volume level to 7.
//     h.	Displays TV status.
//     i.	Turns off the TV.
//     j.	Displays TV status. 

// 14.	You can assign the selected TV station to a channel number on each TV set.
// Complete the TV class with the list of TV stations (list of channel names).
// You can use an array with a size equals to the maximum channel number.
// Assign TV station names for the first ten array elements.
// Then write a program that:
//     a.	Displays a list of TV stations with their channel numbers.
//     b.	Displays the TV status along with the name of the TV station (if available).

public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {
    private boolean isOn;
    private int channelNo;
    private int volume;
    private String[] channelList;

    public TV() {
        this.isOn = false;
        channelList = new String[MAX_CHANNEL];

        //default channel names
        assignChannel(1, "TVP1");
        assignChannel(2, "TVP2");
        assignChannel(3, "TVP Info");
        assignChannel(4, "Polsat");
        assignChannel(5, "TVN");
        assignChannel(6, "TVN24");
        assignChannel(7, "Kultura");
        assignChannel(8, "Historia");
        assignChannel(9, "Sport");
        assignChannel(10, "TV Trwam");
    }

    public boolean isOn() {
        return isOn;
    }

    public int getChannelNo() {
        return channelNo;
    }

    public int getVolume() {
        return volume;
    }

    public String[] getChannelList() {
        return channelList;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public void on() {
        this.isOn = true;
        this.channelNo = MIN_CHANNEL;
        this.volume = MIN_VOLUME;
    }

    @Override
    public void channelDown() {
        if (isOn()) {
            channelNo--;
            if (channelNo < MIN_CHANNEL) {
                channelNo = MAX_CHANNEL;
            }
        }
        
    }

    @Override
    public void channelUp() {
        if (isOn()) {
            channelNo++;
            if (channelNo > MAX_CHANNEL) {
                channelNo = MIN_CHANNEL;
            }
        }
    }

    @Override
    public void setChannel(int channelNo) {
        if (isOn() && channelNo >= MIN_CHANNEL && channelNo <= MAX_CHANNEL) {
            this.channelNo = channelNo;
        } else {
            System.out.println("Wrong channel number!");
        }
    }

    @Override
    public void volumeDown() {
        if (isOn() && volume > MIN_VOLUME) {
            volume--;
        }
    }

    @Override
    public void volumeUp() {
        if (isOn() && volume < MAX_VOLUME) {
            volume++;
        }
    }

    public void assignChannel(String name) {
        this.channelList[channelNo - 1] = name;
    }

    private void assignChannel(int channel, String name) {
        this.channelList[channel - 1] = name;
    }

    public void displayChannels() {
        for (int i = 0; i < channelList.length; i++) {
            if (channelList[i] != null) {
                System.out.println(String.format("%2d", i + 1) + ". " + channelList[i]);
            }
        }
        System.out.println("----------");
    }

    public void status() {
        String status = isOn() ? "ON" : "OFF";
        System.out.println("Status: " + status);
        if (isOn()) {
            String channelName = channelList[channelNo - 1] != null ? ". " + channelList[channelNo - 1] : "";
            System.out.println("Channel: " + channelNo + channelName);
            System.out.println("Volume: " + volume);
        }
        System.out.println("----------");
    }
}