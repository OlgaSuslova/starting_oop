import Animal.Pets;

public class Cat extends Pets {
    private final String fur;

    protected Cat(int height, int weight, String eyeColor, String nickName, String breed, String vaccine, String furColor,
            String dateOfBirth, String fur) {
        super(height, weight, eyeColor, nickName, breed, vaccine, furColor, dateOfBirth);
        this.fur = fur;
    }


    @Override
    public void makeASound() {
        System.out.println("Мяу");
    }

    @Override
    public void showAffection() {
       System.out.println("Я люблю мурлыкать, когда меня гладят!");
    }

    @Override
    public String toString() {
        return String.format("Кот; %s; Наличие шерсти: %s;", super.toString(),this.fur);
    }

}
