package Six;

import java.util.Scanner;

public class sortThreeNumbers {

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
            if (myArray[i] > myArray[i+1]){
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
