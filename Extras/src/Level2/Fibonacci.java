package Level2;

import java.util.Scanner;

public class Fibonacci {

    public  static void generateFibonacci(int nums) {
        int a = 0, b = 1;
        for (int i = 0; i < nums; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        generateFibonacci(num);
    }
}
