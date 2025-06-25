package Level2.LibrarySystem;

public class LibraryManagement {
    public static void main(String[] args) {
        EBook ebook = new EBook("978-1-2345", "Effective Java", "Joshua Bloch", 2.5);
        ebook.displayEBookDetails();
        ebook.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
