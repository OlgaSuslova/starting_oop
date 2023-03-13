package Animal;


public abstract class Animal {
    private int height;
    private int weight;
    private String eyeColor;

    protected Animal(int height, int weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public abstract void makeASound();

    @Override
    public String toString() {
        return String.format("Рост: %d; Вес: %d; Цвет глаз: %s", this.height, this.weight, this.eyeColor);
    }

    

    
}
