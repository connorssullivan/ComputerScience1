package Six;

public class intReversedOrder {
    public static void main(String[] args) {
        int rev = reverse(1234);
        System.out.println(rev);
    }

    public static int reverse(int normal) {
        int number = normal, reverse = 0;

        for( ;number != 0; number=number/10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;

        }
        return reverse;
    }
}


