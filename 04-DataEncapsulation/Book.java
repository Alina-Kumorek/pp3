// 20.	Define a Book class with a title attribute of string type and a pages attribute of integer type.
// Apply data encapsulation. Create an accessor and modifier for each attribute.
// In the method that modifies the number of book pages,
// change the value of the object attribute only when the specified number of book pages is positive. Sample result:
//         Book b = new Book()
//         b.setPages(3)
//         b.setPages(-4)

public class Book {
    private String title;
    private int pages;
    
    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        }
    }
}