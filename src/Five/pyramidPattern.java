package Five;

import java.util.Scanner;

public class pyramidPattern {
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
            for (int i = 1; i<columns;i++){
                System.out.println();
                //
                for (int j = 0; j < (columns-i); j++) {
                    System.out.print(" ");
                }
                //print the
                for (int j = 1; j < (i*2); j++) {
                    System.out.print(j/2);
                }

            }
        }
    }
}




