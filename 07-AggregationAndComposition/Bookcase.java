import java.util.ArrayList;

public class Bookcase {
    private ArrayList<Book> booklist;

    public Bookcase() {
        booklist = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        booklist.add(book);
    }

    public void remBook(Book book) {
        booklist.remove(book);
    }

    public void displayBooks() {
        System.out.println("-------------");
        for (Book b: booklist) {
            System.out.println(b.toString());
        }
        System.out.println("-------------");
    }
}