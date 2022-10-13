package Two;

/*This program takes user input using while loops and calculates tha volume and area of a cylinder*/
import java.util.Scanner;

public class Exersize02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = -1;
        double length = -1;

        while (radius < 0) {
            System.out.println("Enter Radius: ");
            radius = scanner.nextDouble();
        }

        while (length < 0) {
            System.out.println("Enter length: ");
            length = scanner.nextDouble();
        }

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.printf("The Area is $%.4f", area);
        System.out.printf("\nThe Volume is $%.1f", volume);

    }
}
