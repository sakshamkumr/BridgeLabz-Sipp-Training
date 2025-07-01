package SingleLevel.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Author authorBook = new Author(
                "The Art of Clean Code",
                2021,
                "Saksham Agrawal",
                "A backend developer passionate about clean architecture and modular design."
        );
        authorBook.displayInfo();
    }
}
