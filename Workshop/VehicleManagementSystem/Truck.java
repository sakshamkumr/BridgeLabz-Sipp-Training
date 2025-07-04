package VehicleManagementSystem;

public class Truck extends Vehicle {
    int serviceCost;
    Truck(String brand, String model, String fuelType,int serviceCost) {
        super(brand, model, fuelType);
        this.serviceCost = serviceCost;
    }
    @Override
    void calculateServiceCost() {
        System.out.println("service cost for Truck is Rs. : "+serviceCost);
    }
    @Override
    void printServiceDetails(){
        System.out.println("Service details for Truck : ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel type: " + fuelType);
        calculateServiceCost();
    }
}
