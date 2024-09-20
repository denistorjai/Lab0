public class Vacuum extends Appliance {

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
        return "Vacuum: " + super.toString() + " (" + grade + " grade, " + batteryVoltage + "V)";
    }

}
