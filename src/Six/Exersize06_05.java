package Six;

/*This program takes three numbers from the user and displays them from biggest to smallest.
* I used a for loop to determine if the next number in the array is larger then the current value
* and if it is I switched them*/

import java.util.Scanner;

public class Exersize06_05 {

    public static void main(String[] args) {
        displaySortedNumbers();
    }

    public static void displaySortedNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = scanner.nextInt();

        int[] myArray = {num1, num2, num3};
        int temp;

        for (int i = 0; i < myArray.length-1;i++) {
            if (myArray[i] < myArray[i+1]){
                temp = myArray[i];
                myArray[i] = myArray[i+1];
                myArray[i+1] = temp;

            }
        }
        for (int i = 0; i< myArray.length;i++) {
            System.out.println(myArray[i]);
        }


    }
}
