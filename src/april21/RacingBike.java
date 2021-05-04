package april21;

public class RacingBike extends Bike {

    private boolean carbonFrame;

    public RacingBike(int gear, int speed, boolean carbonFrame) {
        super(gear, speed);
        this.carbonFrame = carbonFrame;
    }

    @Override
    public String toString() {
        return String.format("%s and carbonFrame = %s", super.toString(), this.carbonFrame);
    }
}
