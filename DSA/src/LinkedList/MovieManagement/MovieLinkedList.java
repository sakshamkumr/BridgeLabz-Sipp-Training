package LinkedList.MovieManagement;

public class MovieLinkedList {
    Movie head,tail;
    void addAtBeginning(String title, String director, int year, double rating) {
        Movie newNode = new Movie(title, director, year, rating);
        if (head == null) head = tail = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add movie at the end
    void addAtEnd(String title, String director, int year, double rating) {
        Movie newNode = new Movie(title, director, year, rating);
        if (tail == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void addAtPosition(String title, String director, int year, double rating, int position) {
        if (position <= 0) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        Movie newNode = new Movie(title, director, year, rating);
        Movie current = head;
        for (int i = 0; current != null && i < position - 1; i++)
            current = current.next;

        if (current == null || current.next == null) {
            addAtEnd(title, director, year, rating);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    void removeByTitle(String title) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                if (current == head) head = current.next;
                if (current == tail) tail = current.prev;
                if (current.prev != null) current.prev.next = current.next;
                if (current.next != null) current.next.prev = current.prev;
                return;
            }
            current = current.next;
        }
    }

    void searchByDirector(String director) {
        Movie current = head;
        while (current != null) {
            if (current.director.equalsIgnoreCase(director)) {
                System.out.println(current.title + " directed by " + director);
            }
            current = current.next;
        }
    }

    // Search by rating
    void searchByRating(double rating) {
        Movie current = head;
        while (current != null) {
            if (current.rating == rating) {
                System.out.println(current.title + " has rating " + rating);
            }
            current = current.next;
        }
    }
    void displayForward() {
        Movie current = head;
        while (current != null) {
            System.out.println(current.title + " | " + current.director + " | " + current.year + " | " + current.rating);
            current = current.next;
        }
    }

    // Display reverse
    void displayReverse() {
        Movie current = tail;
        while (current != null) {
            System.out.println(current.title + " | " + current.director + " | " + current.year + " | " + current.rating);
            current = current.prev;
        }
    }
    void updateRating(String title, double newRating) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                return;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        MovieLinkedList list = new MovieLinkedList();
        list.addAtBeginning("Inception", "Nolan", 2010, 8.8);
        list.addAtEnd("Interstellar", "Nolan", 2014, 8.6);
        list.addAtPosition("Tenet", "Nolan", 2020, 7.8, 1);
        list.displayForward();
        System.out.println("--- Reverse ---");
        list.displayReverse();
        list.searchByDirector("Nolan");
        list.updateRating("Tenet", 8.1);
        list.removeByTitle("Inception");
        System.out.println("--- After Update & Removal ---");
        list.displayForward();
    }
}
