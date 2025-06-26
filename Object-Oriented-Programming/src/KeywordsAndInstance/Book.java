package KeywordsAndInstance;

public class Book {
    static String libraryName = "Blinkers Library";
    String title;
    String author;
    private final String isbn;
    void displayLibraryName() {
        System.out.println(libraryName);
    }
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public void displayAccountInfo() {
        if(this instanceof Book) {
            System.out.println("Book Title: " + title);
            System.out.println("Book Author: " + author);
            System.out.println("Book ISBN: " + isbn);
        }
        else {
            System.out.println("Book Not Found");
        }
    }

    public static void main(String[] args) {
        Book book = new Book("baratheon", "Jk rowlings", "1234");
        Book b2  = new Book("jamei", "premchand", "5678");
        book.displayLibraryName();
        book.displayAccountInfo();
    }
}
