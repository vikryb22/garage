package garage;

public abstract class Vehicle {
    private String colour;
    private int regNo;
    private int yearOfManufacturing;

    public Vehicle (int regNo, String colour, int yearOfManufacturing){
     super();
     this.colour = colour;
     this.regNo = regNo;
     this.yearOfManufacturing = yearOfManufacturing;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setYearOfManufacturing(int yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }
public String getColour() {
        return this.colour;
}
public int getRegNo(){
        return this.regNo;

}public int getYearOfManufacturing() {
        return this.yearOfManufacturing;
    }

    @Override
    public String toString() {
        return null;
    }
}

