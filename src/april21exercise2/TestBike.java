package april21exercise2;

import java.util.ArrayList;
import java.util.List;

public class TestBike {
    // Creates an Arraylist of bikes and prints them to stdout
    public static void main(String[] args) {
        List<Bike> bikes = new ArrayList<Bike>();
        bikes.add(new MountainBike(22,0,150));
        bikes.add(new CityBike(7,0,"Red"));
        bikes.add(new RacingBike(18,0,true));
        for (Bike bike : bikes) {
            System.out.println(bike);
        }
    }

}
