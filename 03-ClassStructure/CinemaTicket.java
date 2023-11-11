// 7.	Define a class CinemaTicket to describe cinema tickets.
// The ticket attributes are: cinema name, film title, row, seat, and price.
// Since the name of cinema is the same for all tickets, use a static field.
// Then, define a method to display a ticket. Use toString() method.
// Finally, try to create two tickets and display ticket details.

public class CinemaTicket {
    static String cinemaName = "CinemaCenter";

    String filmTitle;
    int row;
    int seat;
    float price;

    public CinemaTicket(String filmTitle, int row, int seat, float price) {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        this.price = price;
    }

    // 8.	Modify the class describing cinema tickets. Add a constructor that creates a ticket for the specified movie,
    // with row and seat numbers. Assume that in the first two rows the ticket price is PLN 10,
    // and in the remaining rows, PLN 25. Then write a program that, in the Morning Star Cinema,
    // creates two tickets for the movie “Gladiator”, the first one is in row 2 and the second one in row 7.
    // Print the created tickets.
    public CinemaTicket(String filmTitle, int row, int seat) {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;

        if (row <= 2) {
            price = 10f;
        } else {
            price = 25f;
        }
    }

    public String toString() {
        return String.format("Cinema name:\t%s\nFilm title:\t%s\nRow:\t\t%d\nSeat:\t\t%d\nPrice:\t\t%.2f zł",
            CinemaTicket.cinemaName, filmTitle, row, seat, price);
    }
}