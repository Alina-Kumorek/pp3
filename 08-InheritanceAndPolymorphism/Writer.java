// 18.	Define a Writer class in your project that describes the writer by his/her first name,
// last name and literary genre. Then, in the Book class, use an object of that class to describe the author of the book.
// Modify other project classes and display the library contents.

public class Writer {
    private String firstName;
    private String lastName;
    private String genre;
    
    public Writer(String firstName, String lastName, String genre) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGenre() {
        return genre;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}