package Level2;

import java.util.Scanner;

public class Factorial {

    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}

