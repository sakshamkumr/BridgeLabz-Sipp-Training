package Level1;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking(){
        this.guestName = "guest123";
        this.roomType = "room1";
        this.nights = 1;
    }
    public HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

}
