// 21.	Define a class Room that represents a hotel room. The class should contain the attributes:
// number, beds, occupied, and guestName. Add constructors: Room(number) (creates a room with two beds)
// and Room(number,beds). Next, define methods for room manipulation: checkin(guestName), checkout(), isOccupied(),
// and displayStatus(). Then write a program in which create three rooms with two beds,
// two rooms with three beds and one room with one bed. Store all room objects in an array:
//         Room[] rooms = new Room[6];
// Then follow the steps below:
//     a.	Display status of a single room (room number, number of beds, occupied, guest name). Display data in a single row.
//     b.	Display a report with a list of rooms (room number, number of beds, occupied, guest name)
//     c.	Display a report with a list of rooms, limited to rooms with the specified number of beds
//     d.	Display a report on how many rooms are vacant and how many are occupied
//     e.	Display a report on how many vacant beds are available
// Create a separate static method for each report. Pass a list of rooms (an array) to the defined static methods.


public class Room {
    private int number;
    private int beds;
    private boolean occupied;
    private String guestName;

    Room(int number) {
        this.number = number;
        this.beds = 2;
        this.occupied = false;
    }

    Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
        this.occupied = false;
    }

    void checkin(String guestName) {
        this.guestName = guestName;
        this.occupied = true;
    }

    void checkout() {
        this.guestName = null;
        this.occupied = false;
    }

    boolean isOccupied() {
        return occupied;
    }

    // void displayStatus() {
    //     String occupancy = isOccupied() ? "YES" : "NO";
    //     String guest = isOccupied() ? guestName : "-";
    //     System.out.printf("Room number: %d; Number of beds: %d; Occupied: %s; Guest name: %s\n",
    //         number, beds, occupancy, guest);
    // }

    static void allRooms(Room[] rooms) {
        for (Room room: rooms) {
            System.out.print(room.toString());
        }
    }

    static void roomsWithBeds(Room[] rooms, int beds) {
        for (Room room: rooms) {
            if (room.beds == beds) {
                System.out.print(room.toString());
            }
        }
    }

    static void occupancy(Room[] rooms) {
        int occCount = 0;
        int vacCount = 0;
        for (Room room: rooms) {
            if (room.isOccupied()) {
                occCount++;
            } else {
                vacCount++;
            }
        }
        System.out.printf("Occupied: %d; Vacant: %d\n", occCount, vacCount);
    }

    static void vacantBeds(Room[] rooms) {
        int bedCount = 0;
        for (Room room: rooms) {
            if (! room.isOccupied()) {
                bedCount += room.beds;
            }
        }
        System.out.printf("Vacant beds: %d\n", bedCount);
    }

    // 22.	Modify the Room class. Define toString() method that returns information about the room status.
    // Replace the displayStatus() method with the defined toString() method.
    // Tip: find out in the course textbook how to define and use the toString() method.

    public String toString() {
        String occupancy = isOccupied() ? "YES" : "NO";
        String guest = isOccupied() ? guestName : "-";

        return String.format("Room number: %d; Number of beds: %d; Occupied: %s; Guest name: %s\n",
            number, beds, occupancy, guest);
    }
 }
