package Program;

/**
 * Product
 */

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String measure;

    public Product(String name, double price, int quantity, String measure) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.measure = measure;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }


    public  void setMeasure(String measure) {
        this.measure = measure;
    }
    public String getMeasure() {
        return measure;
    }


     


    @Override
    public String toString() {
        return String.format("name: %s, price: %.2f, quantity: %d, measure: %s", name, price, quantity, measure);
    }
    
}
