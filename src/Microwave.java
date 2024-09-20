public class Microwave extends Appliance {

    // Variables
    private double capacity;
    private String roomType;

    // Constructor
    public Microwave(String itemNumber, String brand, int quantity, int wattage, String color, double price, double capacity, String roomType) {
        super(itemNumber, brand, quantity, wattage, color, price);
        this.capacity = capacity;
        this.roomType = roomType;
    }

    // Methods
    @Override
    public String toString() {
        return "Microwave: " + super.toString() + " (" + capacity + " cu ft, Room: " + roomType + ")";
    }

}
