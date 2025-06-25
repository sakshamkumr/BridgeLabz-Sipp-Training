package ClassesAndAccessModifiers.Level1;

public class LibrarySystem {
    String title;
    String author;
    double price;
    boolean isAvailable;

    public LibrarySystem(){
        title = "";
        author = "";
        price = 0;
        isAvailable = false;
    }
    public LibrarySystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You've borrowed: " + title);
        } else {
            System.out.println("Sorry, this book is currently unavailable.");
        }
    }
}
