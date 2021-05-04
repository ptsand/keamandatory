package april21exercise2;
// This sub class have access to methods and attributes from Bike
// Should describe a city bike
public class CityBike extends Bike {

    private String color; // assume this attribute is specific to CityBike

    public CityBike(int gear, int speed, String color) {
        super(gear, speed); // Call super class Bike's constructor to set the inherited (general) attributes.
        this.color = color; // Set the specific attribute
    }

    // Override to add color attribute to the string generated
    @Override
    public String toString() {
        return String.format("%s and color = %s", super.toString(), this.color);
    }
}
