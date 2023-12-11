public class Book2 {
    protected String title;
    protected Writer author;
    protected Publisher publisher;
    protected int year;
    
    public Book2(String title, Writer author) {
        this.title = title;
        this.author = author;
    }

    public Book2(String title, Writer author, Publisher publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Writer getAuthor() {
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

    public void setAuthor(Writer author) {
        this.author = author;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void display() {
        String a = author.getFirstName() + " " + author.getLastName();
        String p = this.publisher != null ? publisher.getName() + ", " + publisher.getCity() : "-";
        String y = this.year != 0 ? String.valueOf(year) : "-";
        System.out.println("Book: \"" + title + "\" by " + a + "; Genre: " + author.getGenre() + "; Year: " + y + "; Publisher: " + p);
    }
}