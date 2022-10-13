package Two;

/*This program converts feet to meters based of the formula one foot is 0.305 meters*/

import java.util.Scanner;

public class Exersize02_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double feet = -1;

        while (feet < 0) {
            System.out.println("Enter Feet: ");
            feet = scanner.nextDouble();
        }

        double meters = feet*0.305;

        System.out.println(feet + " feet is " + meters);
    }
}
