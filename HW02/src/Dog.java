import Animal.Pets;

public class Dog extends Pets{
    private final String training;

    protected Dog(int height, int weight, String eyeColor, String nickName, String breed, String vaccine, String furColor,
            String dateOfBirth, String training) {
        super(height, weight, eyeColor, nickName, breed, vaccine, furColor, dateOfBirth);
        this.training = training;
    }

   

    public void doTraining() {
        System.out.println("Идет дрессировка");
    }

    @Override
    public void makeASound() {
        System.out.println("Гав-гав");
    }

    @Override
    public void showAffection() {
        System.out.println("Хочу ловить палку!");
    }

    @Override
    public String toString() {
        return String.format("Собака; %s; Дрессировка: %s", super.toString(), this.training);
    }

    
    
}
