package Introduction;

public class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);

    }

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10000);
        vehicles[2] = new Motorcycle(140, "Petrol", true);

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("---**********---");
        }
    }
}
class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Car");
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Truck");
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}
class Motorcycle extends Vehicle {
    private boolean hasHelmetBox;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasHelmetBox) {
        super(maxSpeed, fuelType);
        this.hasHelmetBox = hasHelmetBox;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Motorcycle");
        System.out.println("Helmet Box Included: " + (hasHelmetBox ? "Yes" : "No"));
    }
}
