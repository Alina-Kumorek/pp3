public class SMS extends Message {
    private String phoneNumber;

    public SMS(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SMS(String text, String phoneNumber) {
        super(text);
        this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("From: " + phoneNumber);
        System.out.println("Message length: " + charNumber());
        System.out.println(getText());
    }
}