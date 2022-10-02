package Five;

import java.util.Random;

public class repeatAddition {
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
            Random number = new Random();
            int num1 = number.nextInt(15)+1;
            int num2 = number.nextInt(15)+1;

            System.out.println(num1+"+"+num2+"="+num1+num2);
        }
    }
}
