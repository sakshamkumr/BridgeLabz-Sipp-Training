package LinkedList.TicketReservation;

class BookingSystem {
    private Ticket head = null;

    // 1. Add a ticket at the end
    public void bookTicket(Ticket newTicket) {
        if (head == null) {
            head = newTicket;
            newTicket.next = head;
        } else {
            Ticket current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newTicket;
            newTicket.next = head;
        }
    }

    // 2. Remove a ticket by Ticket ID
    public void cancelTicket(int ticketID) {
        if (head == null) return;

        Ticket current = head;
        Ticket prev = null;

        do {
            if (current.ticketID == ticketID) {
                if (current == head && current.next == head) {
                    head = null;
                } else if (current == head) {
                    Ticket tail = head;
                    while (tail.next != head) tail = tail.next;
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Ticket " + ticketID + " cancelled.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket ID not found.");
    }

    // 3. Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        System.out.println("Current Ticket Reservations:");
        Ticket current = head;
        do {
            printTicket(current);
            current = current.next;
        } while (current != head);
    }

    // 4. Search by Customer Name or Movie Name
    public void searchTicket(String query) {
        if (head == null) return;

        Ticket current = head;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(query) || current.movieName.equalsIgnoreCase(query)) {
                printTicket(current);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) System.out.println("No matching ticket found for: " + query);
    }

    // 5. Count total tickets
    public int countTickets() {
        if (head == null) return 0;

        int count = 0;
        Ticket current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }

    private void printTicket(Ticket t) {
        System.out.println("ID: " + t.ticketID + ", Customer: " + t.customerName + ", Movie: " + t.movieName +
                ", Seat: " + t.seatNumber + ", Time: " + t.bookingTime);
    }


    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();
        system.bookTicket(new Ticket(1, "Saksham", "Interstellar", "A12", "18:00"));
        system.bookTicket(new Ticket(2, "Aarav", "Inception", "B7", "20:00"));
        system.bookTicket(new Ticket(3, "Maya", "Tenet", "C3", "22:00"));

        system.displayTickets();
        System.out.println("Total Tickets Booked: " + system.countTickets());

        system.searchTicket("Inception");
        system.cancelTicket(2);

        system.displayTickets();
        System.out.println("Total Tickets Booked: " + system.countTickets());
    }
}
