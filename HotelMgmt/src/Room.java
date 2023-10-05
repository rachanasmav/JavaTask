public class Room {
    int roomNumber;
    int floor;
    Guest checkedIn;
    String roomType;
    double pricePerDay;

    public Room(int roomNumber, int floor, Guest checkedIn, String roomType, double pricePerDay){
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.checkedIn = checkedIn;
        this.roomType = roomType;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString(){
        return(
                "Room{" +
                        "roomNo=" + roomNumber +
                        ", floorNo=" + floor +
                        ", checkedIn=" + checkedIn +
                        ", roomType='" + roomType + '\'' +
                        ", pricePerDay=" + pricePerDay +
                        '}'
                );
    }
}
