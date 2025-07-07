package LinkedList.InventoryManagement;

public class Inventory {
    private Item head = null;

    // Add item at beginning
    void addAtBeginning(String name, int id, int qty, double price) {
        Item newNode = new Item(name, id, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add item at end
    void addAtEnd(String name, int id, int qty, double price) {
        Item newNode = new Item(name, id, qty, price);
        if (head == null) head = newNode;
        else {
            Item temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    // Add item at specific position
    void addAtPosition(String name, int id, int qty, double price, int position) {
        if (position <= 0 || head == null) {
            addAtBeginning(name, id, qty, price);
            return;
        }
        Item newNode = new Item(name, id, qty, price);
        Item temp = head;
        for (int i = 0; i < position - 1 && temp.next != null; i++)
            temp = temp.next;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove item by ID
    void removeByID(int itemID) {
        if (head == null) return;
        if (head.itemID == itemID) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemID != itemID)
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Update quantity by ID
    void updateQuantity(int itemID, int newQty) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemID == itemID) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by ID
    void searchByID(int itemID) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemID == itemID) {
                System.out.println("Found: " + temp.itemName + " | Qty: " + temp.quantity + " | Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Search by Name
    void searchByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                System.out.println("Found: ID " + temp.itemID + " | Qty: " + temp.quantity + " | Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Calculate total value of inventory
    void calculateTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }

    // Display all items
    void displayItems() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.itemName + " | ID: " + temp.itemID + " | Qty: " + temp.quantity + " | Price: ₹" + temp.price);
            temp = temp.next;
        }
    }

    // Sort by Name or Price
    void sortInventory(String byField, boolean ascending) {
        head = mergeSort(head, byField.toLowerCase(), ascending);
    }

    private Item mergeSort(Item head, String field, boolean asc) {
        if (head == null || head.next == null) return head;

        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(head, field, asc);
        Item right = mergeSort(nextOfMiddle, field, asc);

        return sortedMerge(left, right, field, asc);
    }

    private Item getMiddle(Item node) {
        if (node == null) return node;
        Item slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next; fast = fast.next.next;
        }
        return slow;
    }

    private Item sortedMerge(Item a, Item b, String field, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (field.equals("name"))
            condition = asc ? a.itemName.compareToIgnoreCase(b.itemName) <= 0 : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        else
            condition = asc ? a.price <= b.price : a.price > b.price;

        Item result;
        if (condition) {
            result = a;
            result.next = sortedMerge(a.next, b, field, asc);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, field, asc);
        }
        return result;
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addAtEnd("Laptop", 101, 5, 70000);
        inventory.addAtBeginning("Mouse", 102, 15, 500);
        inventory.addAtPosition("Keyboard", 103, 10, 1200, 1);

        inventory.displayItems();
        inventory.calculateTotalValue();

        System.out.println("---- Sorted by Name Asc ----");
        inventory.sortInventory("name", true);
        inventory.displayItems();

        System.out.println("---- Sorted by Price Desc ----");
        inventory.sortInventory("price", false);
        inventory.displayItems();
    }
}
