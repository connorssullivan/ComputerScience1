package Two;
/*This program takes a user input for celcius, and converts celcius to farehnhite based off the given formula (9.0/5) * input + 32*/

import java.util.Scanner;

public class Exersize02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double input = scanner.nextDouble();
        double output = (9.0/5) * input + 32;
        System.out.printf(input + " Celsius is %.1f" , output );
        System.out.print(" Fahrenheit");

    }
}
