package KeywordsAndInstance;

public class Vehicle {

    static double registrationFee = 10000.00; // Common to all vehicles


    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;


    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }


    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: ₹" + registrationFee);
    }


    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
        } else {
            System.out.println("Invalid Vehicle object.");
        }
    }


    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Saksham Agrawal", "Motorcycle", "xyz");
        Vehicle v2 = new Vehicle("Nishant Agrawal", "Sedan", "abc");

        v1.displayRegistrationDetails();
        System.out.println();
        v2.displayRegistrationDetails();

        System.out.println("\nUpdating Fee...");
        Vehicle.updateRegistrationFee(6500.00);

        System.out.println();
        v1.displayRegistrationDetails();
    }
}
