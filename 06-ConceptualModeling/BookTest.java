public class BookTest {
    public static void main(String[] args) {
        Book.displayGenres();
        Book b = new Book("A Cosmic Adventure", "Jane Doe", 3, 250, "Hardcover");
        b.displayBook();
        b.setPrice(40);
        b.displayBook();
    }
}