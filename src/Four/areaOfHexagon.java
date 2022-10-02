package Four;

import java.util.Scanner;

public class areaOfHexagon {
    public static void main(String[] args) {
        System.out.println("Enter the length from the center of a pentagon to the vertex: ");
        Scanner scanner = new Scanner(System.in);
        Double length = scanner.nextDouble();

        double s = (6*(Math.pow(length, 2)))/(4*Math.tan(Math.PI/6));

        System.out.println("The side length is "+ s);
    }
}
