public class Vacuum extends Appliance {

    // Vacumm Appliance Subclass

    // Variables
    private String grade;
    private int batteryVoltage;

    // Constructor
    public Vacuum(String itemNumber, String brand, int quantity, int wattage, String color, double price, String grade, int batteryVoltage) {
        super(itemNumber, brand, quantity, wattage, color, price);
        this.grade = grade;
        this.batteryVoltage = batteryVoltage;
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
                "Grade: " + grade + "\n" +
                "BatteryVoltage: " + (batteryVoltage == 18 ? "Low" : "High") + "\n";
    }

    @Override
    public String toFileFormat() {
        return super.commonToFileFormat() + ";" + grade + ";" + batteryVoltage;
    }

    // Getter for batteryVoltage
    public int getBatteryVoltage() {
        return batteryVoltage;
    }

}
