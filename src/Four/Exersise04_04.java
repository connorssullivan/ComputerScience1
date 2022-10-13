package Four;
/*This program takes a side of a hexagon and calculates the area*/

import java.util.Scanner;

public class Exersise04_04 {
    public static void main(String[] args) {
        System.out.println("Enter the side: ");
        Scanner scanner = new Scanner(System.in);
        Double length = scanner.nextDouble();

        double s = (6*(Math.pow(length, 2)))/(4*Math.tan(Math.PI/6));

        System.out.printf("The side length is %.2f", s);
    }
}
