package LinkedList.InventoryManagement;

public class Item {
    String itemName;
    int itemID, quantity;
    double price;
    Item next;

    Item(String itemName, int itemID, int quantity, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
