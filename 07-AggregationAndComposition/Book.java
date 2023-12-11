import java.util.ArrayList;

public class Book {
    private Writer author;
    private String title;
    private String genre;
    private ArrayList<Chapter> chapters;
    private int lastChapterPage;

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.chapters = new ArrayList<Chapter>();
        this.lastChapterPage = 1;
    }

    private class Chapter {
        private String title;
        private int pages;
        private int startPage;

        Chapter(String title, int pages) {
            this.title = title;
            this.pages = pages;
            this.startPage = lastChapterPage;
            lastChapterPage += pages;
            chapters.add(this);
        }
        
        @Override
        public String toString() {
            return title + "; Pages: " + pages + "; Starting on page: " + startPage;
        }
    }

    public void setAuthor(Writer author) {
        this.author = author;
    }

    @Override
    public String toString() {
        String aut = (author != null) ? author.toString() : "-";
        return String.format("Title: %s; Author: %s; Genre: %s", title, aut, genre);
    }

    public void addChapter(String title, int pages) {
        new Chapter(title, pages);
    }

    public void displayChapters() {
        System.out.println("----------");
        System.out.println(this.toString());
        System.out.println("----------");
        for (int i = 0; i < chapters.size(); i++) {
            System.out.println((i + 1) + ". " + chapters.get(i).toString());
        }
        System.out.println("----------");
    }
}