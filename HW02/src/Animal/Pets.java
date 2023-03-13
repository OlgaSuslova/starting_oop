package Animal;

import Interfaces.Home;


public abstract class Pets extends Animal implements Home{
    private String nickName;
    private String breed;
    private String vaccine;
    private String furColor;
    private String dateOfBirth;

    public Pets(int height, int weight, String eyeColor, String nickName, String breed, String vaccine, String furColor,
            String dateOfBirth) {
        super(height, weight, eyeColor);
        this.nickName = nickName;
        this.breed = breed;
        this.vaccine = vaccine;
        this.furColor = furColor;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void makeASound() {    
    }

    @Override
    public void showAffection() {  
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s; Порода: %s; Наличие прививок: %s; Цвет шерсти: %s; Дата рождения: %s; %s;", this.nickName, this.breed, this.vaccine, this.furColor, this.dateOfBirth, super.toString());
    }

    

    

}
