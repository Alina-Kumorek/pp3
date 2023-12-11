// 13.	Add a Library class definition to your project that contains an attribute that stores any books,
// ebooks, or audiobooks. Apply an array. Consider the correct data type for the array.
// Then write a program that creates and displays one book, two e-books and two audiobooks.
// Save all object in the library. Display the contents of the library. Notice which display() object methods are called.

public class Library {
    private Book[] bookList;

    public Library(Book[] bookList) {
        this.bookList = bookList;
    }

    public Book[] getBookList() {
        return bookList;
    }
}