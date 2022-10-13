package Sevan;

import java.util.Random;

public class randomNumberChooser {
    public static void main(String[] args) {
        for (int i = 0; i< 3; i++) {
            for (int j = 0;j<15;j++) {
                System.out.print(getRandom(1, 100, 4, 8, 95, 93) + " ");
            }
            System.out.println();
        }


    }

    public static int getRandom(int start, int end, int ... numbers) {
        int a =(int) ((Math.random() * (end - start)) + start);
        for(int i = 0; i < numbers.length;i++) {
            while (a == numbers[i]) {
                a =(int) ((Math.random() * (end - start)) + start);
            }
        }
        return a;

    }
}
