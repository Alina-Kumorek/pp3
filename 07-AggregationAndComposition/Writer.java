import java.util.ArrayList;

public class Writer {
    private String lastname;
    private String firstname;
    private ArrayList<Book> books;

    public Writer(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        book.setAuthor(this);
        books.add(book);
    }

    public void displayWriter() {
        System.out.println(firstname + " " + lastname);
        System.out.println("----------");
        for (Book b: books) {
            System.out.println(b.toString());
        }
        System.out.println("----------");
    }

    @Override
    public String toString() {
        return String.format("%s, %s", lastname, firstname);
    }
}