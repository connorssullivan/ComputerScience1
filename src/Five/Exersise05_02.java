package Five;

/*This program generates 10 random math addition problems, if the user gets a problem right it displays correct along with the execution time. If a user gets
* it wrong it asks them to guess again. This is done with a while loop and a coupl e of if statments  */

import java.util.Random;
import java.util.Scanner;

public class Exersise05_02 {
    public static void main(String[] args) {
        questionGenerator.questionGenerator();
    }

    static class questionGenerator {
        public static void questionGenerator() {
            System.out.println("The ");
            for(int i = 1;i<=10;i++) {
                question.add();
            }
        }

    }

    class question {

        public static void add() {
            long startTime = System.nanoTime();
            Scanner scanner = new Scanner(System.in);
            Random number = new Random();
            int num1 = number.nextInt(15)+1;
            int num2 = number.nextInt(15)+1;

            boolean flag = true;
            while(flag) {
                System.out.println(num1+"+"+num2+"=");
                int anser = scanner.nextInt();
                if (anser == num1+num2) {
                    System.out.println("Correct");
                    long stopTime = System.nanoTime();
                    long executionTime = stopTime - startTime;
                    System.out.println("Time was: "+executionTime);
                    flag = false;
                }else {
                    System.out.println("Wrong guess again");
                }
            }
        }
    }
}
