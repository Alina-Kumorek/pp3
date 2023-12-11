public class Audiobook2 extends Book2 {
    private int minutes;
    private int seconds;
    
    public Audiobook2(String title, Writer author, int minutes, int seconds) {
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void display() {
        String a = author.getFirstName() + " " + author.getLastName();
        String p = this.publisher != null ? publisher.getName() + ", " + publisher.getCity() : "-";
        String y = this.year != 0 ? String.valueOf(year) : "-";
        System.out.println("Audiobook: \"" + title + "\" by " + a + "; Genre: " + author.getGenre() + "; Year: " + y + "; Publisher: " + p + "; Duration: " + minutes + ":" + seconds);
    }
}