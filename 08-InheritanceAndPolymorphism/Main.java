// 9.	Create a UML class diagram containing the classes: Book, Ebook, Audiobook, and Library.
// For each class, specify the fields and methods (see the following tasks in this section).
// Add relationships between class objects in the diagram. Finally,
// add the Main class to the diagram along with the main() method containing the program's starting point.

public class Main {
    public static void main(String[] args) {
        Ex18();
    }

    static void Ex10() {
        Book b1 = new Book("Ancillary Justice", "Ann Leckie");
        b1.display();

        Book b2 = new Book("All Systems Red", "Martha Wells");
        b2.display();
    }

    static void Ex11() {
        Book b1 = new Book("Ancillary Justice", "Ann Leckie");
        b1.display();

        Ebook b2 = new Ebook("All Systems Red", "Martha Wells", "wells-all_systems_red.epub");
        b2.display();

        Ebook b3 = new Ebook("A Wizard of Earthsea", "Ursula K. Le Guin", "le_guin-a_wizard_of_earthsea.epub");
        b3.display();
    }

    static void Ex12() {
        Book b1 = new Book("Ancillary Justice", "Ann Leckie");
        b1.display();

        Audiobook b2 = new Audiobook("All Systems Red", "Martha Wells", 215, 30);
        b2.display();

        Audiobook b3 = new Audiobook("A Wizard of Earthsea", "Ursula K. Le Guin", 357, 27);
        b3.display();
    }

    static void Ex13() {
        Book b1 = new Book("Ancillary Justice", "Ann Leckie");
        Audiobook b2 = new Audiobook("All Systems Red", "Martha Wells", 197, 30);
        Audiobook b3 = new Audiobook("A Wizard of Earthsea", "Ursula K. Le Guin", 437, 27);
        Ebook b4 = new Ebook("Gideon the Ninth", "Tamsyn Muir", "muir-gideon_the_ninth.epub");
        Ebook b5 = new Ebook("The Space Between Worlds", "Micaiah Johnson", "johnson-the_space_between_worlds");

        Book[] list = {b1, b2, b3, b4, b5};
        Library l = new Library(list);

        for (Book b: l.getBookList()) {
            b.display();
        }
    }

    static void Ex15() {
        Book b1 = new Book("Ancillary Justice", "Ann Leckie");
        Audiobook b2 = new Audiobook("All Systems Red", "Martha Wells", 197, 30);
        Audiobook b3 = new Audiobook("A Wizard of Earthsea", "Ursula K. Le Guin", 437, 27);
        Ebook b4 = new Ebook("Gideon the Ninth", "Tamsyn Muir", "muir-gideon_the_ninth.epub");
        Ebook b5 = new Ebook("The Space Between Worlds", "Micaiah Johnson", "johnson-the_space_between_worlds");

        Publisher p1 = new Publisher("Orbit Books", "London");
        b1.setPublisher(p1);

        Publisher p2 = new Publisher("Recorded Books", "Prince Frederick, MD");
        b2.setPublisher(p2);
        b3.setPublisher(p2);

        Publisher p3 = new Publisher("Tordotcom", "New York");
        b4.setPublisher(p3);

        Publisher p4 = new Publisher("Del Rey", "New York");
        b5.setPublisher(p4);

        Book[] list = {b1, b2, b3, b4, b5};
        Library l = new Library(list);

        for (Book b: l.getBookList()) {
            b.display();
        }
    }

    static void Ex16() {
        Book b1 = new Book("Ancillary Justice", "Ann Leckie");
        b1.setYear(2013);
        Audiobook b2 = new Audiobook("All Systems Red", "Martha Wells", 197, 30);
        b2.setYear(2017);
        Audiobook b3 = new Audiobook("A Wizard of Earthsea", "Ursula K. Le Guin", 437, 27);
        b3.setYear(2009);
        Ebook b4 = new Ebook("Gideon the Ninth", "Tamsyn Muir", "muir-gideon_the_ninth.epub");
        b4.setYear(2019);
        Ebook b5 = new Ebook("The Space Between Worlds", "Micaiah Johnson", "johnson-the_space_between_worlds");
        b5.setYear(2020);

        Publisher p1 = new Publisher("Orbit Books", "London");
        b1.setPublisher(p1);

        Publisher p2 = new Publisher("Recorded Books", "Prince Frederick, MD");
        b2.setPublisher(p2);
        b3.setPublisher(p2);

        Publisher p3 = new Publisher("Tordotcom", "New York");
        b4.setPublisher(p3);

        Publisher p4 = new Publisher("Del Rey", "New York");
        b5.setPublisher(p4);

        Book[] list = {b1, b2, b3, b4, b5};
        Library l = new Library(list);

        for (Book b: l.getBookList()) {
            b.display();
        }
    }

    static void Ex18() {
        Writer w1 = new Writer("Ann", "Leckie", "science fiction");
        Writer w2 = new Writer("Martha", "Wells", "science fiction");
        Writer w3 = new Writer("Ursula K.", "Le Guin", "fantasy");
        Writer w4 = new Writer("Tamsyn", "Muir", "science fiction");
        Writer w5 = new Writer("Micaiah", "Johnson", "science fiction");

        Book2 b1 = new Book2("Ancillary Justice", w1);
        b1.setYear(2013);
        Audiobook2 b2 = new Audiobook2("All Systems Red", w2, 197, 30);
        b2.setYear(2017);
        Audiobook2 b3 = new Audiobook2("A Wizard of Earthsea", w3, 437, 27);
        b3.setYear(2009);
        Ebook2 b4 = new Ebook2("Gideon the Ninth", w4, "muir-gideon_the_ninth.epub");
        b4.setYear(2019);
        Ebook2 b5 = new Ebook2("The Space Between Worlds", w5, "johnson-the_space_between_worlds");
        b5.setYear(2020);

        Publisher p1 = new Publisher("Orbit Books", "London");
        b1.setPublisher(p1);

        Publisher p2 = new Publisher("Recorded Books", "Prince Frederick, MD");
        b2.setPublisher(p2);
        b3.setPublisher(p2);

        Publisher p3 = new Publisher("Tordotcom", "New York");
        b4.setPublisher(p3);

        Publisher p4 = new Publisher("Del Rey", "New York");
        b5.setPublisher(p4);

        Book2[] list = {b1, b2, b3, b4, b5};
        Library2 l = new Library2(list);

        for (Book2 b: l.getBookList()) {
            b.display();
        }
    }
}