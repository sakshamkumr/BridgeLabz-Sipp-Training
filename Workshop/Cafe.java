import java.util.Scanner;

public class Cafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int priceOfCoffee;
        double bill = 0;
        int quantity = 0;
        double GST = 18.0;
        double totalBill = 0;
        System.out.println("Welcome to Chronicles Coffee house Sir/Mam");
        System.out.println("What type of coffee would you like to have?");
        boolean isOrdering = true;
        while(isOrdering) {
            System.out.println("1 Hot Chocolate Coffee");
            System.out.println("2 Chocolate Coffee");
            System.out.println("3 Cold Coffee");
            System.out.println("4 Regular Espresso");
            int choice = sc.nextInt();
            if(choice < 5) {
                switch (choice) {
                    case 1:
                        priceOfCoffee = 100;
                        bill += priceOfCoffee;
                        break;
                    case 2:
                        priceOfCoffee = 200;
                        bill += priceOfCoffee;
                        break;
                    case 3:
                        priceOfCoffee = 300;
                        bill += priceOfCoffee;
                        break;
                    case 4:
                        priceOfCoffee = 150;
                        bill += priceOfCoffee;
                }
                quantity++;
                System.out.println("Sir you want to order anything True/False");
                isOrdering = sc.nextBoolean();
            }

        }
        totalBill += (bill + (bill * GST)/100);
        System.out.println("Your bill Sir of Rs: " + totalBill);
        System.out.println("Thank you for the payment, Sir.");
        System.out.println("Thank you! We hope to see you again at Chronicles Coffee house!");

    }
}
