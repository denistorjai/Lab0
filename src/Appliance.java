public class Appliance {

    // Variables
    protected String itemNumber;
    protected String brand;
    protected int quantity;
    protected int wattage;
    protected String color;
    protected double price;

    // Constructor
    public Appliance(String itemNumber, String brand, int quantity, int wattage, String color, double price) {
        this.itemNumber = itemNumber;
        this.brand = brand;
        this.quantity = quantity;
        this.wattage = wattage;
        this.color = color;
        this.price = price;
    }

    // Methods
    @Override
    public String toString() {
        return brand + " (Item No: " + itemNumber + ", Price: $" + price + ")";
    }

}
