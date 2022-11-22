package garage;

public class Motorcycle extends Vehicle {
    private int numOfWheels;

    private Motorcycle(int regNo, String colour, int yearOfNanufacturing) {
        super(regNo, colour, yearOfNanufacturing);
        this.numOfWheels = numOfWheels;

    }
    void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }
    public int getNumOfWheels() {
        return this.numOfWheels;
    }
}
