package Program;

/**
 * Milk
 */

public class Milk extends Drink{
    private double fatPercentage;
    private String bestBeforeDate;
    
    public Milk(String name, double price, int quantity, String measure, int capacity, double fatPercentage,
            String bestBeforeDate) {
        super(name, price, quantity, measure, capacity);
        this.fatPercentage = fatPercentage;
        this.bestBeforeDate = bestBeforeDate;
    }

    public double getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(double fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public String getBestBeforeDate() {
        return bestBeforeDate;
    }

    public void setBestBeforeDate(String bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }

    public String toString() {
        return String.format("%s; fat percentage: %s%%;", super.toString(), this.fatPercentage);
    }


    
}
