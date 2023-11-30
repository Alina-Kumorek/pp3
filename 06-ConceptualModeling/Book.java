// 13.	The Best Books publishing house releases crime, drama, fantasy, and science fiction  books.
// Consider what attributes can be used to describe the books. Then create a class diagram containing books attributes.
// Finally, define the class based on the created class diagram.

public class Book {
    private static String publisher = "The Best Books";
    private static String[] genreTypes = {"crime", "drama", "fantasy", "science fiction"};
    private static int currentYear = 2024;

    private String title;
    private String author;
    private int genre;
    private int yearPub;
    private int pages;
    private String bookFormat;
    private float price;

    public static void displayGenres() {
        for (int i = 0; i < Book.genreTypes.length; i++) {
            System.out.println(i + ". " + Book.genreTypes[i]);
        }
    }

    public Book(String title, String author, int genre, int pages, String bookFormat) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearPub = Book.currentYear;
        this.pages = pages;
        this.bookFormat = bookFormat;
    }

    public void displayBook() {
        System.out.printf("Title:\t\t%s\n", title);
        System.out.printf("Author:\t\t%s\n", author);
        System.out.printf("Genre:\t\t%s\n", Book.genreTypes[genre]);
        System.out.printf("Publisher:\t%s\n", Book.publisher);
        System.out.printf("Year:\t\t%d\n", yearPub);
        System.out.printf("Pages:\t\t%d\n", pages);
        System.out.printf("Book format:\t%s\n", bookFormat);
        String p = price > 0 ? String.format("%.2f PLN", price) : "-";
        System.out.printf("Price:\t\t%s\n", p);
        System.out.println("----");
    }

    public void setPrice(float price) {
        if (price > 0f) {
            this.price = price;
        }
    }
}
