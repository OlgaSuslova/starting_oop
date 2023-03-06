package Program;

/**
 * App
 */

public class App {
   
    public static void main(String[] args) {
      Product newMilk = new Milk("Knyaginino", 78, 20, "litr", 1, 3, "28.03.2023");
      
      Product newLemonade = new Drink("Cola", 100, 20, "litr", 1);
      
      Product newBread = new Bread("Sormovo", 55, 25, "gramm", "10.03.2023", "wheat");

      Product newEgg = new Eggs("Seyma", 90, 10, "piece", "20.03.2023", 10);

      Product newMask = new HygieneProduct("mask", 50, 20, "piece", 50, 50);

      Product newToiletPaper = new TouletPaper("zewa", 250, 20, "piece", 12, 12, 2);

      Product newDiaper = new Diapers("huggies", 1200, 20, "piece", 50, 50, 12, 9, 14, "hypoallergenic");

      Product newNipple = new BabyProduct("baby", 50, 20, "piece", 0, "low");


      System.out.println(newMilk);
      System.out.println(newLemonade);
      System.out.println(newBread);
      System.out.println(newEgg);
      System.out.println(newMask);
      System.out.println(newToiletPaper);
      System.out.println(newDiaper);
      System.out.println(newNipple);

    }
}
