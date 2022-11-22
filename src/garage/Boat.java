package garage;

public class Boat extends Vehicle implements CanFloat{
    private int numOfPropellers;

    private Boat(int regNo, String colour, int yearOfManufacturing){
        super(regNo, colour, yearOfManufacturing);
        this.numOfPropellers = numOfPropellers;
    }
    void setNumOfPropellers(int numOfPropellers){
        this.numOfPropellers = numOfPropellers;
    }
    public int getNumOfPropellers(){
        return this.numOfPropellers;
    }
}
