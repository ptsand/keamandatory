package april21;

public class MountainBike extends Bike {

    private int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        this.seatHeight = startHeight;
    }

    public void seatHeight(int newValue) {
        this.seatHeight = newValue;
    }

    @Override
    public String toString() {
        return String.format("%s and seatHeight = %s", super.toString(), this.seatHeight);
    }
}
