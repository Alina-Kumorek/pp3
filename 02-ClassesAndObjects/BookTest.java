// 26.	Define a class for describing books.
// Then, in the class, define fields and methods that represent the attributes and behaviors of book objects.
// Finally, create two books, assign them attribute values, and call defined methods.

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Pan Tadeusz", "Adam Mickiewicz", 20);
        b1.displayInfo();

        Book b2 = new Book("Balladyna", "Juliusz Słowacki", 15);
        b2.displayInfo();
        b2.bookOpen();
        while (b2.isOpen) {
            b2.pageRead(b2.bookmark);
            b2.goNext();
        }
        b2.goBeggining();
    }
}