public class Microwave extends Appliance {

    // Microwave Appliance Subclass

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
        return "ItemNumber: " + itemNumber + "\n" +
                "Brand: " + brand + "\n" +
                "Quantity: " + quantity + "\n" +
                "Wattage: " + wattage + "\n" +
                "Color: " + color + "\n" +
                "Price: " + price + "\n" +
                "Capacity: " + capacity + "\n" +
                "RoomType: " + roomType + "\n";
    }

    // To File Format Method
    @Override
    public String toFileFormat() {
        return super.commonToFileFormat() + ";" + capacity + ";" + roomType;
    }

    // Getter for roomType
    public String getRoomType() {
        return roomType;
    }

}
