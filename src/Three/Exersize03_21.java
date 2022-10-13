package Three;

/*This program takes a yearm a mounth and a date from the user, then calculates the day of the week using the
* static method in the zeller congruence class*/

import java.util.Scanner;

public class Exersize03_21 {
    public static void main(String[] args) {
        int i = zellersCongruence.getDay();
        System.out.println(i);
        String day = "";
        switch (i) {
            case 0:
                day = "Monday";
                break;
            case 1:
                day = "Tuesday";
                break;
            case 2:
                day = "Wensday";
                break;
            case 3:
                day = "Thursday";
                break;
            case 4:
                day = "Friday";
                break;
            case 5:
                day = "Saturday";
                break;
            case 6:
                day = "Sunday";
                break;
        }
        System.out.println("The day is "+day);

    }

    class zellersCongruence {

        public static int getDay(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Year: ");
            int year = scanner.nextInt()/100;
            int j = year /100;
            //System.out.println(j);
            System.out.println("Enter Month: ");
            int m = scanner.nextInt();
            System.out.println("Enter Date of the Month: ");
            int q = scanner.nextInt();
            int k = year%100;
            //System.out.println(k);


            int h = ((q)+
                    (26*(m+1)/10)+
                    (k)+
                    (k/4)+
                    (j/4)+
                    (5*j))%7;
            return h;
        }


    }
}
