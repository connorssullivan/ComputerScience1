package Four;

import java.util.Scanner;

public class findCharecterOfAnASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        while (num< 0 || num > 127) {
            System.out.println("Enter ASCII code: ");
            num = scanner.nextInt();
        }
        char ch = (char) num;
        System.out.println(ch);
    }
}
