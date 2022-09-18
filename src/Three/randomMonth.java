package Three;

import java.util.Random;
import java.util.Scanner;

/*This program generates a random month, then prints a statment saying what the
 month is*/

public class randomMonth {
    public static void main(String[] args) {
        Random random = new Random();



        int month = random.nextInt(12)+1;
        System.out.println(month);
        String monthName="";

        switch (month) {
            case 1:
              monthName = "January";
              break;
            case 2:
                monthName = "Febuary";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "Augest";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }

        System.out.println("The month is, "+monthName);
    }
}
