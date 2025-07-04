package VehicleManagementSystem;

class Car extends Vehicle {
    int serviceCost;
    Car(String brand, String model, String fuelType,int serviceCost) {
        super(brand, model, fuelType);
        this.serviceCost = serviceCost;
    }

    @Override
    void calculateServiceCost() {
        System.out.println("service cost for Car is Rs.: " + serviceCost);
    }

    @Override
    void printServiceDetails() {
        System.out.println("Service details for Car :");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
        calculateServiceCost();
    }


}
