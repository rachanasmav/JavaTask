public class HotelMain {
    public static void main(String[] args) {


        Guest guest1 = new Guest(1, "meredith", "grey", "meredith@gamil.com");
        Guest guest2 = new Guest(2, "callie", "torres", "callie@gamil.com");
        Guest guest3 = new Guest(3, "derek", "shep", "derek@gamil.com");
        Guest guest4 = new Guest(4, "mark", "sloan", "mark@gamil.com");


        Room[] demo = new Room[8];

        Room room1 = new Room(301, 1, guest1, "deluxe", 1000);
        demo[0] = room1;
        Room room2 = new Room(302, 1, null, "single", 1000);
        demo[1] = room2;
        Room room3 = new Room(303, 1, guest2, "cottage", 2000);
        demo[2] = room3;
        Room room4 = new Room(304, 1, null, "single", 1000);
        demo[3] = room4;
        Room room5 = new Room(305, 1, guest3, "normal", 3000);
        demo[4] = room5;
        Room room6 = new Room(306, 1, null, "single", 1000);
        demo[5] = room6;
        Room room7 = new Room(307, 1, guest4, "Private", 4000);
        demo[6] = room7;
        Room room8 = new Room(308, 1, null, "single", 1000);
        demo[7] = room8;


        Hotel hotel = new Hotel("paradise", demo);


        Guest g1 = hotel.findGuestCheckedInRoom(301);
        System.out.println(" 1) findGuestCheckedInRoom using roomID: " + g1);

        int c1 = hotel.guestsCount();
        System.out.println(" 2) guestsCount: " + c1);

        double e1 = hotel.earningToday();
        System.out.println(" 3) earningToday: " + e1);
        System.out.println(" 4) All Guests: ");

        Guest[] ag1 = hotel.findAllGuest();
        for (int i = 0; i < ag1.length; i++) {
            if (ag1[i] != null) {
                System.out.println(ag1[i]);
            }
        }
    }
}