package Five;
/*This program uses nested loops to generate a pyramid of numbers in a pattern. The first lloop takes care of the height. The second loop
* takes care of the spaces before each pattern. And the third loop takes care of the pattern printing*/

import java.util.Scanner;

public class Exersise05_17 {
    public static void main(String[] args) {
        pyramid.pyramid();
    }

    static class pyramid {

        public static void pyramid() {
            //get the input between 1 and 15
            Scanner scanner = new Scanner(System.in);
            int columns = 0;
            while (columns < 1 || columns > 15) {
                System.out.println("How many columns? ");
                columns = scanner.nextInt();
            }

            //Make a pyramid with the the specified akound of colums
            //firstloop gives the amount of rows
            for (int i = 1; i<=columns;i++){
                System.out.println();
                //
                for (int j = 0; j < (columns-i); j++) {
                    System.out.print(" ");
                }
                //print the
                for (int c = 1; c < (i*2); c++) {
                    System.out.print(Math.abs(i-c)+1);
                }

            }
        }
    }
}




