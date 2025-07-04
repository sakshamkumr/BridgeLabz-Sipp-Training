package VehicleManagementSystem;

public class Vehicle {
    String brand;
    String model;
    String fuelType;

    public Vehicle(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }

    void calculateServiceCost(){}
    void printServiceDetails() {}
}

