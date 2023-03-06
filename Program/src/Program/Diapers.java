package Program;

/**
 * Diapers
 */

public class Diapers extends HygieneProduct {
    private int size;
    private int minWeight;
    private int maxWeight;
    private String type;
    
    public Diapers(String name, double price, int quantity, String measure, int capacity, int packQuantity, int size,
            int minWeight, int maxWeight, String type) {
        super(name, price, quantity, measure, capacity, packQuantity);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(int minWeight) {
        this.minWeight = minWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s, size: %d, min weight: %s, max weight: %s, type: %s", super.toString(), size, minWeight, maxWeight, type);
    }


    
}
