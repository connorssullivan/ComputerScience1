package Four;

import java.awt.geom.Area;
import java.util.Scanner;

public class areaOfAPentagon {
    public static void main(String[] args) {
        System.out.println("Enter the length from th center of a pentagon to the vertex: ");
        Scanner scanner = new Scanner(System.in);
        Double length = scanner.nextDouble();

        double s = 2*length*Math.sin(Math.PI/5);

        double area = (5*(Math.pow(s, 2)))/(4*Math.tan(Math.PI/5));

        System.out.println("The area is "+ area);


    }
}
