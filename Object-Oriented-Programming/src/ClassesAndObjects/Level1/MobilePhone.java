package ClassesAndObjects.Level1;

public class MobilePhone {
    String brand;
    String model;
    int price;
    public MobilePhone(){
        brand = "";
        model = "";
        price = 0;
    }
    public MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayDetails(MobilePhone m){
        System.out.println("Brand: " + m.brand
        + "\nModel: " + m.model   + "\nPrice: " + m.price);
    }

    public static void main(String[] args) {
        MobilePhone m = new MobilePhone();
        m.brand = "Apple";
        m.model = "16 pro";
        m.price = 10;
        m.displayDetails(m);


    }

}
