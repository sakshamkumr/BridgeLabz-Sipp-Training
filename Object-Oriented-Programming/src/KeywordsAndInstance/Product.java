package KeywordsAndInstance;

public class Product {

    static double discount = 10.0;

    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }


    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Current Discount: " + discount + "%");
        } else {
            System.out.println("Invalid product object.");
        }
    }
    public static void main(String[] args) {
        Product prod1 = new Product("Wireless Mouse", 599.99, 2, 101);
        Product prod2 = new Product("Mechanical Keyboard", 2299.50, 1, 102);

        prod1.displayProductDetails();
        System.out.println();
        prod2.displayProductDetails();

        System.out.println();
        Product.updateDiscount(15.0); // Update static discount

        System.out.println();
        prod1.displayProductDetails(); // Check updated discount
    }
}
