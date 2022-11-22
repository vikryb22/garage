package garage;
public class Airplane extends Vehicle implements CanFly {
    private int numOfWings;

private Airplane(int regNo, String colour, int yearOfManufacturing, int numOfWings) {
    super(regNo, colour, yearOfManufacturing );
    this.numOfWings = numOfWings;
}
void setNumOfWings(int numOfWings){
    this.numOfWings = numOfWings;
}
public int getNumOfWings(){
    return this.numOfWings;
}
}
