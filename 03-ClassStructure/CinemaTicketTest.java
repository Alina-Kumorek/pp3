public class CinemaTicketTest {
    public static void main (String[] args) {
        Ex08();
    }

    static void Ex07() {
        CinemaTicket t1 = new CinemaTicket("Chłopi", 3, 10, 25);
        System.out.println(t1.toString());
    }

    static void Ex08() {
        CinemaTicket.cinemaName = "Morning Star Cinema";

        CinemaTicket t1 = new CinemaTicket("Gladiator", 2, 8);
        CinemaTicket t2 = new CinemaTicket("Gladiator", 7, 10);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }
}