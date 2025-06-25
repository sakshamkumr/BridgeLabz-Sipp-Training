package ClassesAndObjects.Level2;

import java.sql.Timestamp;
import java.util.Scanner;

public class MovieTicket {
    static Scanner sc = new Scanner(System.in);
    String movieName;
    int seatNumber;
    int price;
    Timestamp created;
    public MovieTicket() {

    }
    public MovieTicket(String movieName, int seatNumber, int price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void BookTicket(String movieName) {
        seatNumber++;
        price = 299;
        System.out.println("Ticket Booked for :" + movieName + " and assigned seat umber is "+ seatNumber);
    }
    public void dsiplayTicektDetails(String movieName) {
        System.out.println("Ticket Details for :" + movieName +" are ");
        System.out.println("Seat number : " + seatNumber
        + "\nprice : " + price);
        System.out.println("Booking time :" + created);
    }

    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        System.out.println("Enter the movie name : ");
        movieTicket.movieName = sc.next();
        movieTicket.created = new Timestamp(System.currentTimeMillis());
        movieTicket.BookTicket(movieTicket.movieName);
        movieTicket.dsiplayTicektDetails(movieTicket.movieName);

    }
}
