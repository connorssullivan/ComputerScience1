package Four;
/* this program takes user input between 1 and 127, then converts the int to its
* equivilant ASCII charecter*/

import java.util.Scanner;

public class Exersize04_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        while (num< 0 || num > 127) {
            System.out.println("Enter ASCII code: ");
            num = scanner.nextInt();
        }
        char ch = (char) num;
        System.out.println(ch);
    }
}
