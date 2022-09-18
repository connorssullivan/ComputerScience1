package Three;

import java.util.Scanner;

public class dayOfTheWeek {
    public static void main(String[] args) {
        int i = zellersCongruence.getDay();
        System.out.println(i);
        String day = "";
        switch (i) {
            case 0:
                day = "Saturday";
            case 1:
                day = "Sunday";
            case 2:
                day = "Monday";
            case 3:
                day = "Tuesday";
            case 4:
                day = "Wensday";
            case 5:
                day = "Thursday";
            case 6:
                day = "Friday";
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
