public class Dishwasher extends Appliance {

    // Variables
    private String feature;
    private String soundRating;

    // Constructor
    public Dishwasher(String itemNumber, String brand, int quantity, int wattage, String color, double price, String feature, String soundRating) {
        super(itemNumber, brand, quantity, wattage, color, price);
        this.feature = feature;
        this.soundRating = soundRating;
    }

    // Methods
    @Override
    public String toString() {
        return "Dishwasher: " + super.toString() + " (Feature: " + feature + ", Sound: " + soundRating + ")";
    }

}
