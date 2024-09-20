import java.io.*;
import java.util.*;

public class FileParser {

    // Array of Objects
    private List<Appliance> applianceList = new ArrayList<>();

    // Create Objects Function
    public void parseFile() {

        // Try & Catch to parse
        try (InputStream inputStream = getClass().getResourceAsStream("/appliances.txt");

             // Input Stream
             BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {

            // While Loop
            String line;
            while ((line = br.readLine()) != null) {

                // Line splitting and Data
                String[] data = line.split(";");
                String itemNumber = data[0];
                char firstDigit = itemNumber.charAt(0);

                // Switch Case for first digit
                switch (firstDigit) {

                    // Refrigerator - first digit is 1
                    case '1':
                        applianceList.add(new Refrigerator(itemNumber, data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4], Double.parseDouble(data[5]), Integer.parseInt(data[6]), Double.parseDouble(data[7]), Double.parseDouble(data[8])));
                        break;

                    // Vacuum - first digit is 2
                    case '2':
                        applianceList.add(new Vacuum(itemNumber, data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4], Double.parseDouble(data[5]), data[6], Integer.parseInt(data[7])));
                        break;

                    // Microwave - first digit is 3
                    case '3':
                        applianceList.add(new Microwave(itemNumber, data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4], Double.parseDouble(data[5]), Double.parseDouble(data[6]), data[7]));
                        break;

                    // Dishwasher - first digit is 4 or 5
                    case '4':
                    case '5':
                        applianceList.add(new Dishwasher(itemNumber, data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4], Double.parseDouble(data[5]), data[6], data[7]));
                        break;
                }
            }

            // Loaded Successfully
            System.out.println("Appliances loaded successfully.");

            // Catch if Error
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    // Method to purchase an appliance
    public void purchaseAppliance() {

        // Ask for Item of Appliance
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the item number of an appliance: ");
        String itemNumber = scanner.nextLine();

        // For Loop
        for (Appliance appliance : applianceList) {

            // If Appliance is Available than subtract Quantity if not then print not available.
            if (appliance.getItemNumber().equals(itemNumber)) {
                if (appliance.getQuantity() > 0) {
                    appliance.setQuantity(appliance.getQuantity() - 1);
                    System.out.println("Appliance \"" + itemNumber + "\" has been checked out.");
                    return;
                } else {
                    System.out.println("The appliance is not available to be checked out.");
                    return;
                }
            }

        }
        // No Appliances found
        System.out.println("No appliances found with that item number.");
    }

    // Method to find appliances by brand
    public void findApplianceByBrand() {

        // Input for brand
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter brand to search for: ");
        String brand = scanner.nextLine().toLowerCase();

        // Find matching appliances
        System.out.println("Matching Appliances:");
        boolean found = false;
        for (Appliance appliance : applianceList) {
            if (appliance.getBrand().toLowerCase().equals(brand)) {
                System.out.println(appliance);
                found = true;
            }
        }

        if (!found) {
            // No appliances found
            System.out.println("No appliances found for brand: " + brand);
        }
    }

    // Method to display appliances by type
    public void displayAppliancesByType() {
        // prints
        Scanner scanner = new Scanner(System.in);
        System.out.println("Appliance Types:");
        System.out.println("1 – Refrigerators");
        System.out.println("2 – Vacuums");
        System.out.println("3 – Microwaves");
        System.out.println("4 – Dishwashers");
        System.out.print("Enter type of appliance: ");
        int type = scanner.nextInt();

        // Switch cases
        switch (type) {
            // display refrigerators
            case 1:
                displayRefrigeratorsByDoors();
                break;
            // display Vacuums
            case 2:
                displayVacuumsByBatteryVoltage();
                break;
            // display Microwaves
            case 3:
                displayMicrowavesByRoomType();
                break;
            // display Dishwashers
            case 4:
                displayDishwashersBySoundRating();
                break;
            default:
                // Invalid
                System.out.println("Invalid appliance type.");
        }
    }

    // Method to display random appliances
    public void produceRandomApplianceList() {
        // Get Input and Randomize
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of appliances: ");
        int numberOfAppliances = scanner.nextInt();
        Random rand = new Random();

        // Randomize between chosen amount
        System.out.println("Random appliances:");
        for (int i = 0; i < numberOfAppliances; i++) {
            int randomIndex = rand.nextInt(applianceList.size());
            System.out.println(applianceList.get(randomIndex));
        }
    }

    // Method to save the appliance list back to the file
    public void saveToFile() {
        // try catch - save
        try (PrintWriter writer = new PrintWriter(new FileWriter("appliances.txt"))) {
            for (Appliance appliance : applianceList) {
                writer.println(appliance.toFileFormat());
            }
            System.out.println("Appliances saved successfully.");
        } catch (IOException error) {
            // fail
            error.printStackTrace();
        }
    }

    // Display Vacuums
    public void displayVacuums() {
        System.out.println("Displaying all vacuums:");
        for (Appliance appliance : applianceList) {
            if (appliance instanceof Vacuum) {
                Vacuum vacuum = (Vacuum) appliance;
                System.out.println(vacuum);  // Calls Vacuum's toString() method
            }
        }
    }

    // Display Refrigerator
    public void displayRefrigerators() {
        System.out.println("Displaying all refrigerators:");
        for (Appliance appliance : applianceList) {
            if (appliance instanceof Refrigerator) {
                Refrigerator refrigerator = (Refrigerator) appliance;
                System.out.println(refrigerator);  // Calls Refrigerator's toString() method
            }
        }
    }

    // Display Microwave
    public void displayMicrowaves() {
        System.out.println("Displaying all microwaves:");
        for (Appliance appliance : applianceList) {
            if (appliance instanceof Microwave) {
                Microwave microwave = (Microwave) appliance;
                System.out.println(microwave);  // Calls Microwave's toString() method
            }
        }
    }

    // Display Dishwasher
    public void displayDishwashers() {
        System.out.println("Displaying all dishwashers:");
        for (Appliance appliance : applianceList) {
            if (appliance instanceof Dishwasher) {
                Dishwasher dishwasher = (Dishwasher) appliance;
                System.out.println(dishwasher);  // Calls Dishwasher's toString() method
            }
        }
    }

    // Display by Doors
    public void displayRefrigeratorsByDoors() {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of doors: 2 (double door), 3 (three doors), or 4 (four doors): ");
        int doors = scanner.nextInt();

        // Print found by doors
        System.out.println("Matching refrigerators:");
        for (Appliance appliance : applianceList) {
            if (appliance instanceof Refrigerator) {
                Refrigerator refrigerator = (Refrigerator) appliance;
                if (refrigerator.getNumberOfDoors() == doors) {
                    System.out.println(refrigerator);
                }
            }
        }
    }

    // Display by Voltage
    public void displayVacuumsByBatteryVoltage() {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter battery voltage value. 18 V (low) or 24 V (high): ");
        int voltage = scanner.nextInt();

        // Display by Voltage
        System.out.println("Matching vacuums:");
        for (Appliance appliance : applianceList) {
            if (appliance instanceof Vacuum) {
                Vacuum vacuum = (Vacuum) appliance;
                if (vacuum.getBatteryVoltage() == voltage) {
                    System.out.println(vacuum);
                }
            }
        }
    }

    // Microwave
    public void displayMicrowavesByRoomType() {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Room where the microwave will be installed: K (kitchen) or W (work site): ");
        String roomType = scanner.next();

        // Display by Work or Kitchen
        System.out.println("Matching microwaves:");
        for (Appliance appliance : applianceList) {
            if (appliance instanceof Microwave) {
                Microwave microwave = (Microwave) appliance;
                if (microwave.getRoomType().equalsIgnoreCase(roomType)) {
                    System.out.println(microwave);
                }
            }
        }
    }

    // Dishwashers
    public void displayDishwashersBySoundRating() {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sound rating of the dishwasher: Qt (Quietest), Qr (Quieter), Qu (Quiet), or M (Moderate): ");
        String soundRating = scanner.next();

        // Display by Sound
        System.out.println("Matching dishwashers:");
        for (Appliance appliance : applianceList) {
            if (appliance instanceof Dishwasher) {
                Dishwasher dishwasher = (Dishwasher) appliance;
                if (dishwasher.getSoundRating().equalsIgnoreCase(soundRating)) {
                    System.out.println(dishwasher);
                }
            }
        }
    }
}
