public class Ebook2 extends Book2 {
    private String fileName;

    public Ebook2(String title, Writer author, String fileName) {
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
        String a = author.getFirstName() + " " + author.getLastName();
        String p = this.publisher != null ? publisher.getName() + ", " + publisher.getCity() : "-";
        String y = this.year != 0 ? String.valueOf(year) : "-";
        System.out.println("Ebook: \"" + title + "\" by " + a + "; Genre: " + author.getGenre() + "; Year: " + y + "; Publisher: " + p + "; File Name: " + fileName);
    }
}