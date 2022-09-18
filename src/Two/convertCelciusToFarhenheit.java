package Two;
/*This program converts celcius to farehnhite*/

import java.util.Scanner;

public class convertCelciusToFarhenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double input = scanner.nextDouble();
        double output = (9.0/5) * input + 32;
        System.out.println(input + " Celsius is " + output + " Fahrenheit");

    }
}
