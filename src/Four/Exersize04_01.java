package Four;
/*THis program takes the length from the center of a pentagon to its vertex and calculates the
* area based off a formula*/

import java.util.Scanner;

public class Exersize04_01 {
    public static void main(String[] args) {
        System.out.println("Enter the length from the center of a pentagon to the vertex: ");
        Scanner scanner = new Scanner(System.in);
        Double length = scanner.nextDouble();

        double s = 2*length*Math.sin(Math.PI/5);

        double area = (5*(Math.pow(s, 2)))/(4*Math.tan(Math.PI/5));

        System.out.printf("The area is %.2f", area);


    }
}
