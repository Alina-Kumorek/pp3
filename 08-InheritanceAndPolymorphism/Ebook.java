// 11.	Add an Ebook class definition to your project that derives from the Book class
// (inherits the Book class attributes and methods). Add an attribute: file name.
// Create a constructor where you assign the ebook attribute values (title, author and file name).
// Add accessor and mutator methods for all ebook attributes. Also add a display()
// method to display information about the ebook. Then, write a program that creates and displays one book and two e-books.

public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, String author, String fileName) {
        super(title, author);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        String p = this.publisher != null ? publisher.getName() + ", " + publisher.getCity() : "-";
        String y = this.year != 0 ? String.valueOf(year) : "-";
        System.out.println("Ebook: \"" + title + "\" by " + author + "; Year: " + y + "; Publisher: " + p + "; File Name: " + fileName);
    }
}