// 10.	Create a Book class that describes books. Add book attributes: title and author.
// Create a constructor where you assign book attribute values. Add accessor and mutator methods for all book attributes.
// Add also a display() method to display information about the book. Then, write a program that creates and displays two books.

// 15.	Modify the Book class by adding the publisher attribute.
// Then make the necessary changes to the remaining classes to display the library content along with publisher information.

// 16.	Modify the Book class. Add the book's year of publication attribute,
// as well as accessor and mutator methods for this attribute. Then modify other project classes and display the library contents.

public class Book {
    protected String title;
    protected String author;
    protected Publisher publisher;
    protected int year;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, Publisher publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
    public Publisher getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void display() {
        String p = this.publisher != null ? publisher.getName() + ", " + publisher.getCity() : "-";
        String y = this.year != 0 ? String.valueOf(year) : "-";
        System.out.println("Book: \"" + title + "\" by " + author + "; Year: " + y + "; Publisher: " + p);
    }
}