package Level2;

import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();

        System.out.print("Convert to (C/F): ");
        String unit = sc.next().toUpperCase();

        if (unit.equals("C")) {
            System.out.println("In Celsius: " + fahrenheitToCelsius(temp));
        } else if (unit.equals("F")) {
            System.out.println("In Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
