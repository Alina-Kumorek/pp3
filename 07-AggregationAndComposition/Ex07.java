// 6.	Working in a group, create Book and Writer classes in a class diagram. Define class attributes and methods.
// Consider that the book has one author. Create a relationship between the classes assuming that objects
// of those classes can exist independently. If one is deleted other can still exist.
// What kind of relationship should be used? Mark the multiplicity in the class diagram.
// Save the class diagram to a graphic file.

// 7.	Based on the created class diagram, define the classes in the programming language.
// Put the classes in a separate project. Then write a program that creates objects, assigns them attribute values,
// and calls the available methods.

public class Ex07 {
    public static void main(String[] args) {
        Writer w = new Writer("Tolkien", "John R. R.");

        Book b1 = new Book("Hobbit", "fantasy");
        Book b2 = new Book("Lord of the Rings", "fantasy");

        w.addBook(b1);
        w.addBook(b2);

        w.displayWriter();

        Book b3 = new Book("Aucilliary Justice", "sci-fi");
        System.out.println(b3);
    }
}