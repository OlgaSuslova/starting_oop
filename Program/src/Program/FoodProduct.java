package Program;

/**
 * FoodProduct
 */

public class FoodProduct extends Product {
    private String bestBeforeDate;

    public FoodProduct(String name, double price, int quantity, String measure, String bestBeforeDate) {
        super(name, price, quantity, measure);
        this.bestBeforeDate = bestBeforeDate;
    }

    public void setbestBeforeDate(String bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }
    public String getbestBeforeDate() {
        return bestBeforeDate;
    }

    @Override
    public String toString() {
        return String.format("%s best before date: %s", super.toString(), bestBeforeDate);

    }
}
