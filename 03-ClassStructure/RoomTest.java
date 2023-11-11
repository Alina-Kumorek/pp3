public class RoomTest {
    public static void main(String[] args) {
        Room[] rooms = new Room[6];
        rooms[0] = new Room(1);
        rooms[1] = new Room(2);
        rooms[1].checkin("Smith");
        rooms[2] = new Room(3);
        rooms[3] = new Room(4, 3);
        rooms[3].checkin("Johnson");
        rooms[4] = new Room(5, 3);
        rooms[5] = new Room(6, 1);
        rooms[5].checkin("Doe");
        rooms[5].checkout();

        System.out.print(rooms[0].toString());
        System.out.println("---");
        Room.allRooms(rooms);
        System.out.println("---");
        Room.roomsWithBeds(rooms, 3);
        System.out.println("---");
        Room.occupancy(rooms);
        Room.vacantBeds(rooms);
    }
}
