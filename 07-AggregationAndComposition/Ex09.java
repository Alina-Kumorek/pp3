// 9.	Books can be placed on a bookcase. Create a class diagram.
// Use the previously defined Book and Writer classes (created diagram should contain three classes).
// Assume that the bookcase can hold any number of books. When creating a class diagram,
// pay attention to the relationships between classes,
// taking into account that the book can exist independently of the bookcase. Mark the multiplicity in the class diagram.
// Then, based on the class diagram, write a program that allows books to be placed in and removed from the bookshelf.
// Display the bookcase contents.

public class Ex09 {
    public static void main(String[] args) {
        Writer w1 = new Writer("Tolkien", "John R. R.");
        Book b1 = new Book("Hobbit", "fantasy");
        Book b2 = new Book("Lord of the Rings", "fantasy");
        w1.addBook(b1);
        w1.addBook(b2);
        Writer w2 = new Writer("Leckie", "Ann");
        Book b3 = new Book("Aucilliary Justice", "sci-fi");
        w2.addBook(b3);

        Bookcase bc = new Bookcase();
        bc.addBook(b1);
        bc.addBook(b2);
        bc.addBook(b3);

        bc.displayBooks();

        bc.remBook(b3);

        bc.displayBooks();
    }
}