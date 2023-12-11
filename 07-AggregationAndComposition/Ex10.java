// 10.	Add a Chapter class to the diagram that you have created,
// describing the chapter in a book (chapter title, number of pages, starting page number).
// Assume that a book can contain any number of chapters. What is the relationship between the book and chapters?
// Can a chapter exist without a book? Then modify the program for operating the bookshelf.

public class Ex10 {
    public static void main(String[] args) {
        Writer w = new Writer("Tolkien", "John R. R.");
        Book b1 = new Book("Hobbit", "fantasy");
        w.addBook(b1);

        b1.addChapter("An Unexpected Party", 20);
        b1.addChapter("Roast Mutton", 15);
        b1.addChapter("A Short Rest", 18);
        b1.addChapter("Over Hill and Under Hill", 30);
        b1.addChapter("Riddles in the Dark", 40);

        b1.displayChapters();

        Book b2 = new Book("Lord of the Rings", "fantasy");
        w.addBook(b2);

        b2.addChapter("A Long-expected Party", 60);

        b2.displayChapters();
    }
}