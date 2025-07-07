package LinkedList.LibraryManagement;

class LibraryManager {
    private Book head, tail;

    // 1. Add a book at the beginning
    public void addBookAtBeginning(Book book) {
        if (head == null) {
            head = tail = book;
        } else {
            book.next = head;
            head.prev = book;
            head = book;
        }
    }

    // 2. Add a book at the end
    public void addBookAtEnd(Book book) {
        if (head == null) {
            head = tail = book;
        } else {
            tail.next = book;
            book.prev = tail;
            tail = book;
        }
    }

    // 3. Add book at specific position (1-based index)
    public void addBookAtPosition(Book book, int position) {
        if (position <= 1 || head == null) {
            addBookAtBeginning(book);
            return;
        }

        Book current = head;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current == tail) {
            addBookAtEnd(book);
        } else {
            book.next = current.next;
            book.prev = current;
            current.next.prev = book;
            current.next = book;
        }
    }

    // 4. Remove a book by Book ID
    public void removeBookByID(int id) {
        Book current = head;
        while (current != null) {
            if (current.bookID == id) {
                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + id + " not found.");
    }

    // 5. Search by Title or Author
    public void searchBook(String query) {
        Book current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(query) || current.author.equalsIgnoreCase(query)) {
                displayBook(current);
            }
            current = current.next;
        }
    }

    // 6. Update availability status
    public void updateAvailability(int bookID, boolean status) {
        Book current = head;
        while (current != null) {
            if (current.bookID == bookID) {
                current.isAvailable = status;
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    // 7. Display books forward
    public void displayForward() {
        Book current = head;
        while (current != null) {
            displayBook(current);
            current = current.next;
        }
    }

    // 8. Display books in reverse
    public void displayReverse() {
        Book current = tail;
        while (current != null) {
            displayBook(current);
            current = current.prev;
        }
    }

    // 9. Count total books
    public int countBooks() {
        int count = 0;
        Book current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    private void displayBook(Book b) {
        System.out.println("ID: " + b.bookID + ", Title: " + b.title + ", Author: " + b.author +
                ", Genre: " + b.genre + ", Available: " + b.isAvailable);
    }

    public static void main(String[] args) {
        LibraryManager lib = new LibraryManager();

        lib.addBookAtEnd(new Book("Sapiens", "Yuval Noah Harari", "History", 101, true));
        lib.addBookAtBeginning(new Book("Clean Code", "Robert C. Martin", "Programming", 102, false));
        lib.addBookAtPosition(new Book("Atomic Habits", "James Clear", "Self-Help", 103, true), 2);

        lib.displayForward();
        System.out.println("Total Books: " + lib.countBooks());

        lib.searchBook("James Clear");
        lib.updateAvailability(102, true);

        lib.removeBookByID(101);
        lib.displayReverse();
    }
}
