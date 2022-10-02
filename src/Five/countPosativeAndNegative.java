package Five;

import java.util.ArrayList;
import java.util.Scanner;

public class countPosativeAndNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer, the input ends if it is 0: ");
        String stringInput = scanner.nextLine();
        String stringNums[] = stringInput.split(" ");
        ArrayList<Integer> nums = new ArrayList<>();
        float total = 0;
        float average = 0;
        int totalPos = 0;
        int totalNeg = 0;
        for (int i = 0; i< stringNums.length; i++) {
            int number = Integer.parseInt(stringNums[i]);
            nums.add(number);
            //System.out.println(nums.indexOf(i));
        }
        for(int i = 0; i < nums.size();i++) {
            if (nums.get(i) > 0){
                totalPos++;
            }
            if (nums.get(i) < 0) {
                totalNeg++;
            }
            total += nums.get(i);

        }
        average = total/nums.size();
        System.out.println("The number of posatives is "+totalPos);
        System.out.println("The number of negatives is "+ totalNeg);
        System.out.println("The total is "+total);
        System.out.println("The average is "+average);

    }

}
