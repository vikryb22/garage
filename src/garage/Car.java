package garage;

public class Car extends Vehicle {
    private int numOfDoors;

    private Car(int regNo, String colour, int yearOfManufacturing){
        super(regNo, colour, yearOfManufacturing);
        this.numOfDoors = numOfDoors;
    }
    void setNumOfDoors(int numOfDoors){
        this.numOfDoors = numOfDoors;
    }

    public int getNumSeats(){
        return this.numOfDoors;
    }
}
