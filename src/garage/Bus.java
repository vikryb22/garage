package garage;

public class Bus extends Vehicle {
    private int numOfSeats;

    private Bus(int regNo, String colour, int yearOfManufacturing){
        super(regNo, colour, yearOfManufacturing);
        this.numOfSeats = numOfSeats;
    }
    void setNumOfSeats(int numOfSeats){
        this.numOfSeats = numOfSeats;
    }

    public int getNumOfSeats() {
        return this.numOfSeats;
    }
}
