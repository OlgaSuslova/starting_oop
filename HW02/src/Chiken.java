import Animal.Bird;
import Interfaces.BirdFly;

 


public class Chiken extends Bird implements BirdFly {

    protected Chiken(int height, int weight, String eyeColor, int flightHeight) {
        super(height, weight, eyeColor, flightHeight);
    }

    @Override
    public void makeASound() {
        System.out.println("Ко-ко-ко");
        
    }

    @Override
    public String toString() {
        return String.format("Курица; %s", super.toString());
    }

    @Override
    public void toFly() {
        System.out.printf("Я лечу на %d метрах", super.getFlightHeight());
        
    }

    @Override
    public void fly() {
        
        super.fly();
    }
    
    
    
}
