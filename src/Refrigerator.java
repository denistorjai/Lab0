public class Refrigerator extends Appliance {

    // Refrigerator Appliance Sub Class

    // Variables
    private int numberOfDoors;
    private double height;
    private double width;

    // Constructor
    public Refrigerator(String itemNumber, String brand, int quantity, int wattage, String color, double price, int numberOfDoors, double height, double width) {
        super(itemNumber, brand, quantity, wattage, color, price);
        this.numberOfDoors = numberOfDoors;
        this.height = height;
        this.width = width;
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
                "Number of Doors: " + numberOfDoors + "\n" +
                "Height: " + height + "\n" +
                "Width: " + width + "\n";
    }

    // To File Format
    @Override
    public String toFileFormat() {
        return super.commonToFileFormat() + ";" + numberOfDoors + ";" + height + ";" + width;
    }

    // Getter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

}