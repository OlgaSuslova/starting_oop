package Program;

/**
 * Bread
 */

public class Bread extends FoodProduct{
    private String typeOfFlour;

    public Bread(String name, double price, int quantity, String measure, String bestBeforeDate, String typeOfFlour) {
        super(name, price, quantity, measure, bestBeforeDate);
        this.typeOfFlour = typeOfFlour;
    }

    public String getTypeOfFlour() {
        return typeOfFlour;
    }

    public void setTypeOfFlour(String typeOfFlour) {
        this.typeOfFlour = typeOfFlour;
    }

    
    public String toString() {
        return String.format("%s; type of flour: %s%%;", super.toString(), this.typeOfFlour);
    }

  
}
