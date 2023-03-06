package Program;

/**
 * HygieneProduct
 */

public class HygieneProduct extends Product{
    private int packQuantity;

    public HygieneProduct(String name, double price, int quantity, String measure, int capacity, int packQuantity) {
        super(name, price, capacity, measure);
        this.packQuantity = packQuantity;
    }

    public void setPackQuantity(int packQuantity) {
        this.packQuantity = packQuantity;
    }

    public int getPackQuantity() {
        return packQuantity;
    }

    @Override
    public String toString() {
        return String.format("%s, pack quantity: %d", super.toString(), packQuantity);
    }
}
    

