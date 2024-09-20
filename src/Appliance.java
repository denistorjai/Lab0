public abstract class Appliance {

    // Super Class

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
    public String commonToFileFormat() {
        return itemNumber + ";" + brand + ";" + quantity + ";" + wattage + ";" + color + ";" + price;
    }

    // Abstract Method
    public abstract String toFileFormat();

    // Getter for itemNumber
    public String getItemNumber() {
        return itemNumber;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
