// 10.	Using inheritance, define an Email class that derives from the Message class
// and describes messages sent using email. The class includes the following attributes:
// message subject and recipient's address. The class also includes accessor and mutator methods for class attributes.
// Add a constructor that allows you to create an email with the given subject and content
// that is sent to the given email address. Then create and send two emails.

public class Email extends Message {
    private String subject;
    private User recipient;

    public Email(String text, String subject, User recipient) {
        super(text);
        this.subject = subject;
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    @Override
    public void send() {
        System.out.println("To: " + recipient.toString());
        System.out.println("Adress: " + recipient.getEmail());
        System.out.println("Subject: " + subject);
        System.out.println("Message length: " + charNumber());
        System.out.println(getText());
    }
}