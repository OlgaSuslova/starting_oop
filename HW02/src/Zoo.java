import java.util.ArrayList;
import java.util.Scanner;

import Animal.Animal;
import Interfaces.BirdFly;
import Interfaces.Home;



public class Zoo {
    public static ArrayList<Animal> allAnimal = new ArrayList<>();
    {
        allAnimal.add(new Cat(20, 15, "голубые", "Барсик", "уличный", "да", "белый", "12.02.22", "да"));
        allAnimal.add(new Tiger(1025, 23, "серые", "Африка", "12.04.20"));
        allAnimal.add(new Dog(22, 22, "зеленые", "Шарик", "долматинец", "да", "черно-белый", "12.12.19", "да"));
        allAnimal.add(new Wolf(100, 80, "Голубые", "Россия", "31.12.2009", "Да"));
        allAnimal.add(new Chiken(35, 2, "Желтые", 1));
        allAnimal.add(new Storck(45, 5, "Желтые", 0));
    }
    
    public int size() {
        return allAnimal.size();
    }

    public void addCat(Scanner input){
        String nickName;
        String breed;
        String vaccine;
        String color;
        String dateofBirth;
        int height;
        int weight;
        String eyeColor;
        String fur;

        System.out.print("Имя: ");
        nickName = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Вакцины: ");
        vaccine = input.next();
        System.out.print("Цвет: ");
        color = input.next();
        System.out.print("Дата рождения: ");
        dateofBirth = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Шерсть: ");
        fur = input.next();

        Zoo.allAnimal.add(new Cat(height, weight, eyeColor, nickName, breed, vaccine, color, dateofBirth, fur));
    }

    public void addDog(Scanner input){
        String nickName;
        String breed;
        String vaccine;
        String color;
        String dateofBirth;
        int height;
        int weight;
        String eyeColor;
        String training;

        System.out.print("Имя: ");
        nickName = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Вакцины: ");
        vaccine = input.next();
        System.out.print("Цвет: ");
        color = input.next();
        System.out.print("Дата рождения: ");
        dateofBirth = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Дресировка: ");
        training = input.next();

        
        allAnimal.add(new Dog(height, weight, eyeColor, nickName, breed, vaccine, color, dateofBirth, training));
    }

    public void addTiger(Scanner input){
        int height;
        int weight;
        String eyeColor;
        String habitat;
        String date;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Место обитания: ");
        habitat = input.next();
        System.out.print("Дата обнаружения: ");
        date = input.next();

        allAnimal.add(new Tiger(height, weight, eyeColor, habitat, date));
    }

    public void addWolf(Scanner input){
        int height;
        int weight;
        String eyeColor;
        String place;
        String date;
        String leaderOfPack;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Место обитания: ");
        place = input.next();
        System.out.print("Дата обнаружения: ");
        date = input.next();
        System.out.print("Вожак стаи: ");
        leaderOfPack = input.next();

        allAnimal.add(new Wolf(height, weight, eyeColor, place, date, leaderOfPack));
    }

    public void addChiken(Scanner input){
        int height;
        int weight;
        String eyeColor;
        int flightWeight;


        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Высота полета: ");
        flightWeight = input.nextInt();

        allAnimal.add(new Chiken(height, weight, eyeColor, flightWeight));
    }

    public void addStorck(Scanner input){
        int height;
        int weight;
        String colorEye;
        int hightFly;


        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Высота полета: ");
        hightFly = input.nextInt();

        allAnimal.add(new Storck(height, weight, colorEye, hightFly));
    }

    public void showAll(){
        int index = 0;
        for (Animal animal : allAnimal) {
            System.out.printf("%d) ", index);
            System.out.println(animal);
            System.out.println("----");
            index++;
        }
    }

    public void removeAnimal(int num){
        allAnimal.remove(num);
    }

    public void showAnimal(int num){
       System.out.println(allAnimal.get(num));
       if (allAnimal.get(num) instanceof Home){
        ((Home)allAnimal.get(num)).showAffection();
       }
       if (allAnimal.get(num) instanceof BirdFly){
        ((BirdFly)allAnimal.get(num)).toFly();
       }  
    }

    public void animalSay(int num) {
        allAnimal.get(num).makeASound();
    }

    public void sayAllAnimals(){
        for (Animal animal : allAnimal) {
            animal.makeASound();
        }
    }
}