import Animal.WildAnimal;

public class Wolf extends WildAnimal {
    private final String leaderOfPack;

    protected Wolf(int height, int weight, String eyeColor, String habitat, String date, String leaderOfPack) {
        super(height, weight, eyeColor, habitat, date);
        this.leaderOfPack = leaderOfPack;
    }

    @Override
    public void makeASound() {
        System.out.println("Ауууууу");
    }

    @Override
    public String toString() {
        return String.format("Волк; %s; Вожак стаи: %s", this.leaderOfPack);
    }

    

    
}
