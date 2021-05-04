package april21exercise2;
// Super class implementation (should describe a general bikes attributes and behavior)
public class Bike {

    private int gear, speed;

    public Bike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void ApplyBrake(int decrement) {
        this.speed -= decrement;
    }

    public void SpeedUp(int increment) {
        this.speed += increment;
    }

    public String toString() {
        return String.format("Type: %s\nAttributes: speed = %d, gear = %d",
                this.getClass().getSimpleName(), this.speed, this.gear);
    }
}

