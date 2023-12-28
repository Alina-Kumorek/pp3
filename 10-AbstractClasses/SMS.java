// 9.	Using inheritance, define an SMS class that derives from the Message class
// and describes text messages sent from a mobile phone. The class contains the phone number attribute
// to which the text message is sent. The class constructor allows you to initialize a phone number.
// The class also includes accessor and mutator methods to modify value of the attribute.
// Then create and send two mobile messages.

public class SMS extends Message {
    private User recipient;

    public SMS(String text) {
        super(text);
    }

    public SMS(String text, User recipient) {
        super(text);
        this.recipient = recipient;
    }
    
    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    @Override
    public void send() {
        System.out.println("To: " + recipient.toString());
        System.out.println("Phone number: " + recipient.getPhoneNumber());
        System.out.println("Message length: " + charNumber());
        System.out.println(getText());
    }
}