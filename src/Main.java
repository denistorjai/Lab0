// Imports
import java.util.Scanner;

public class Main {

   // Main Function
    public static void main(String[] args) {

        // Parser Class and Parse
        FileParser parser = new FileParser();
        parser.parseFile();
        Scanner scanner = new Scanner(System.in);

        // Display Options and Get User Input
        while (true) {

            // Options
            System.out.println("Welcome to Modern Appliances!");
            System.out.println("How may we assist you?");
            System.out.println("1 – Check out appliance");
            System.out.println("2 – Find appliances by brand");
            System.out.println("3 – Display appliances by type");
            System.out.println("4 – Produce random appliance list");
            System.out.println("5 – Save & exit");
            System.out.print("Enter option: ");

            // Input and Cases
            int option = scanner.nextInt();
            switch (option) {

                // Case 1 - Purchase Appliance
                case 1:
                    parser.purchaseAppliance();
                    break;

                // Case 2 - Find Appliance by Brand
                case 2:
                    parser.findApplianceByBrand();
                    break;

                // Case 3 - Display Appliance by Type
                case 3:
                    parser.displayAppliancesByType();
                    break;

                // Case 4 - Produce Random Appliance List
                case 4:
                    parser.produceRandomApplianceList();
                    break;

                // Case 5 - Save to File
                case 5:
                    parser.saveToFile();  // Save back to appliances.txt
                    System.out.println("Thank you for using Modern Appliances! Goodbye.");
                    return;

                // Default - Invalid Option - Continue Loop
                default:
                    System.out.println("Invalid option. Please try again.");

            }
        }
    }
}
