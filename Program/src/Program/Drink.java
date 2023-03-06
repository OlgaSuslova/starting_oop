package Program;

/**
 * Drink
 */

public class Drink extends Product {
    private int capacity;

    public Drink(String name, double price, int quantity, String measure, int capacity) {
        super(name, price, quantity, measure);
        this.capacity = capacity;
    }

    public void getCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public int setCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return String.format("%s, capacity: %d", super.toString(), capacity);
    }
    
    

}
