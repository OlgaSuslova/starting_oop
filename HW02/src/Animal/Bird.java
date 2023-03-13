package Animal;

public abstract class Bird extends Animal {
    protected int flightHeight;

    protected Bird(int height, int weight, String eyeColor, int flightHeight) {
        super(height, weight, eyeColor);
        this.flightHeight = flightHeight;
    }

    public void fly() {
        System.out.println("Я лечу на " + flightHeight + " метрах");
    }

    public int getFlightHeight() {
        return flightHeight;
    }

      

}
