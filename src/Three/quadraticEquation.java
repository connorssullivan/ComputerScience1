package Three;

import java.util.Scanner;

/*This program generates calculates the roots of a quadratic*/

public class quadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        double discriminant = ((Math.pow(b ,2)) - (4*a*c));

        double quad1 = ((-b + Math.sqrt(discriminant))/(2.0*a));
        double quad2 = ((-b - Math.sqrt(discriminant))/(2.0*a));

        if(discriminant > 0) {
            System.out.println(" The eqaution has two roots " + quad1 + " and " + quad2);
        }

        if(discriminant == 0) {
            System.out.println(" The eqaution has one rootq " + quad1);
        }

        if(discriminant < 0) {
            System.out.println(" The eqaution has no real roots " );
        }


    }
}
