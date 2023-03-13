package Animal;

public abstract class WildAnimal extends Animal{
    private String habitat;
    private String date;
    
    public WildAnimal(int height, int weight, String eyeColor, String habitat, String date) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.date = date;
    }

    @Override
    public void makeASound() {
     
    }

    @Override
    public String toString() {
        return String.format("Место Обитания: %s; Дата нахождения: %s; %s", this.habitat, this.date, super.toString());
    }

    
    
}
