package ClassesAndObjects.Level1;

public class Item {
    int itemCode;
    String itemName;
    double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void display() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    public double getTotalPrice(int quantity) {
        return price*quantity;
    }

    public static void main(String[] args) {
        Item item = new Item(1, "Item1", 10.0);
        item.display();
        System.out.println(item.getTotalPrice(5));
    }
}
