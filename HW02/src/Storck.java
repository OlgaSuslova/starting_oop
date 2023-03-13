import Animal.Bird;
import Interfaces.BirdFly;

public class Storck extends Bird implements BirdFly{

    protected Storck(int height, int weight, String eyeColor, int flightHeight) {
        super(height, weight, eyeColor, flightHeight);
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void makeASound() {
        System.out.println("Я аист");
        
    }

    @Override
    public String toString() {
        return String.format("Аист; %s", super.toString());
    }

    @Override
    public void toFly() {
        System.out.printf("Я лечу на высоте %d метров", super.getFlightHeight());
    }
    
    
    
}
