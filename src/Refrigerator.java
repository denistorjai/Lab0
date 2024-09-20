public class Refrigerator extends Appliance {

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
        return "Refrigerator: " + super.toString() + " (" + numberOfDoors + " doors, " + height + "x" + width + " inches)";

    }

}