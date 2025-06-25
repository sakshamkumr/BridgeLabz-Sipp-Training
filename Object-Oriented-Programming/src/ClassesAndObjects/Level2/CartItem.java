package ClassesAndObjects.Level2;

public class CartItem {
    String itemName;
    int price;
    int quantity;

    public CartItem() {
        itemName = "";
        price = 0;
        quantity = 0;
    }

    public CartItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void AddItemToCart() {
        quantity++;
        price += price;
    }

    public void removeItemFromCart(CartItem cartItem) {
        if(quantity  <= 0){
            System.out.println("You don't have enough stock to remove this item");
        }
        else {
            quantity--;
            price -= price;
        }
    }

    public void displayTotalPrice() {
        System.out.println("Total price is " + price);
    }

    public static void main(String[] args) {
        CartItem c1 = new CartItem("Book 1", 2000, 1);

        c1.AddItemToCart();
        c1.AddItemToCart();
        c1.AddItemToCart();
        c1.displayTotalPrice();



    }

}
