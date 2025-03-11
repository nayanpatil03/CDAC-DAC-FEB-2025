import java.util.Scanner; // Import Scanner for user input

public class CarDemo {
    double fuel = 0, kmDriven = 0; // Fuel and Distance variables

    // Method to add fuel
    void addFuel(double liters) {
        fuel = fuel + liters; // Increase fuel amount
        System.out.println("Fuel added: " + liters + "L"); // Show fuel added
    }

    // Method to drive the car
    void drive(double km) {
        double neededFuel = km / 10; // 10 km per liter
        if (fuel >= neededFuel) { // Check if enough fuel is available
            kmDriven = kmDriven + km; // Increase distance driven
            fuel = fuel - neededFuel; // Reduce fuel based on distance
            System.out.println("Drove " + km + " km | Fuel left: " + fuel + "L"); // Show status
        } else {
            System.out.println("Not enough fuel!"); // Show warning if fuel is low
        }
    }

    // Method to check total distance driven
    void checkOdometer() {
        System.out.println("Distance driven: " + kmDriven + " km"); // Print distance driven
    }

    // Main method (Program starts here)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        CarDemo myCar = new CarDemo(); // Create Car object

        System.out.print("Enter fuel amount (L): "); // Ask user to enter fuel
        double fuelAmount = sc.nextDouble(); // Read fuel input
        myCar.addFuel(fuelAmount); // Call addFuel() method

        System.out.print("Enter distance to drive (km): "); // Ask user for distance
        double distance = sc.nextDouble(); // Read distance input
        myCar.drive(distance); // Call drive() method

        myCar.checkOdometer(); // Call method to check odometer (total distance)

        sc.close(); // Close Scanner
    }
}
