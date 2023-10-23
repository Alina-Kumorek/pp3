public class Book {
    String bookTitle;
    String bookAuthor;
    int pages;
    boolean isOpen = false;
    int bookmark = 1; // for remembering what was the last page open

    public Book(String title, String author, int numberOfPages) {
        bookTitle = title;
        bookAuthor = author;
        pages = numberOfPages;
    }

    void displayInfo() {
        System.out.printf("Title:\t%s\n", bookTitle);
        System.out.printf("Author:\t%s\n", bookAuthor);
    }

    void bookOpen() {
        isOpen = true;
        System.out.println("The book gets opened.");
    }

    void bookClose() {
        isOpen = false;
        System.out.println("The book gets closed.");
    }

    void pageRead(int page) {
        if (isOpen && page > 0 && page <= pages) {
            System.out.printf("This is page %d.\n", page);
        } else {
            System.out.println("Can't find this page.");
        }
    }

    void goNext() {
        bookmark ++;
        if (bookmark > pages) {
            bookmark = pages;
            bookClose();
        }
    }

    void goPage(int page) {
        if (page > 0 && page <= pages) {
            bookmark = page;
        } else {
             System.out.println("Can't find this page.");
        }
    }

    void goBeggining() {
        goPage(1);
    }
}
