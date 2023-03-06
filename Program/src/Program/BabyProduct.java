package Program;

/**
 * BabyProduct
 */

public class BabyProduct extends Product {
    private int minAge;
    private String hypoAllergenicity;
    
    public BabyProduct(String name, double price, int quantity, String measure, int minAge, String hypoAllergenicity) {
        super(name, price, quantity, measure);
        this.minAge = minAge;
        this.hypoAllergenicity = hypoAllergenicity;
    }
    public int getMinAge() {
        return minAge;
    }
    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }
    public String getHypoAllergenicity() {
        return hypoAllergenicity;
    }
    public void setHypoAllergenicity(String hypoAllergenicity) {
        this.hypoAllergenicity = hypoAllergenicity;
    }
    @Override
    public String toString() {
        return String.format("%s, min age: %d, hypo allergenecity: %s", super.toString(), minAge, hypoAllergenicity);
    }

   
}
