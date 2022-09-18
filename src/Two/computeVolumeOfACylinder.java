package Two;

/*This program calculates tha volume and area of a cylinder*/
import java.util.Scanner;

public class computeVolumeOfACylinder {
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

        System.out.println("The Area is " + area);
        System.out.println("The Volume is " + volume);

    }
}
