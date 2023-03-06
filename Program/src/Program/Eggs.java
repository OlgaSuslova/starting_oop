package Program;

/**
 * Eggs
 */

public class Eggs extends FoodProduct {
    private int packQuantity;

    public Eggs(String name, double price, int quantity, String measure, String bestBeforeDate, int packQuantity) {
        super(name, price, quantity, measure, bestBeforeDate);
        this.packQuantity = packQuantity;
    }

    public int getPackQuantity() {
        return packQuantity;
    }

    public void setPackQuantity(int packQuantity) {
        this.packQuantity = packQuantity;
    }

    @Override
    public String toString() {
        return String.format("%s, pack quantity: %d", super.toString(), packQuantity);
    }

   
    
}
