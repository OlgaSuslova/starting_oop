package Program;

/**
 * TouletPaper
 */

public class TouletPaper extends HygieneProduct {
    private int layersNumber;

    public TouletPaper(String name, double price, int quantity, String measure, int capacity, int packQuantity,
            int layersNumber) {
        super(name, price, quantity, measure, capacity, packQuantity);
        this.layersNumber = layersNumber;
    }

    public int getLayersNumber() {
        return layersNumber;
    }

    public void setLayersNumber(int layersNumber) {
        this.layersNumber = layersNumber;
    }

    @Override
    public String toString() {
        return String.format("%s, layers number: %d", super.toString(), layersNumber);
    }

        
}
