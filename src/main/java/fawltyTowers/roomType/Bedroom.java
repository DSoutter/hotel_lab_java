package fawltyTowers.roomType;

public class Bedroom extends Room {

    private BedroomType bedroomType;
    private int roomNumber;

    public Bedroom(int capacity, ArrayList<Guest> guestList,  int roomNumber, BedroomType bedroomType) {
        super(capacity, guestList);
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
    }

    public BedroomType getBedroomType() {
        return bedroomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
