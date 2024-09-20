public class Dishwasher extends Appliance {

    // Dishwasher Appliance Subclass

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
        return "ItemNumber: " + itemNumber + "\n" +
                "Brand: " + brand + "\n" +
                "Quantity: " + quantity + "\n" +
                "Wattage: " + wattage + "\n" +
                "Color: " + color + "\n" +
                "Price: " + price + "\n" +
                "Feature: " + feature + "\n" +
                "SoundRating: " + soundRating + "\n";
    }

    @Override
    public String toFileFormat() {
        return super.commonToFileFormat() + ";" + feature + ";" + soundRating;
    }

    // Getter for soundRating
    public String getSoundRating() {
        return soundRating;
    }

}
