package Level1;

public class CarRentalSystem {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 500.0;

    public CarRentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalRate() {
        return rentalDays*dailyRate;
    }
}
