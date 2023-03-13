import Animal.WildAnimal;

public class Tiger extends WildAnimal {

    protected Tiger(int height, int weight, String eyeColor, String habitat, String date) {
        super(height, weight, eyeColor, habitat, date);
    }

    @Override
    public void makeASound() {
       System.out.println("РРРРРР");
    }

    @Override
    public String toString() {
        return String.format("Тигр; %s;", super.toString());
    }
    
    
    
}
