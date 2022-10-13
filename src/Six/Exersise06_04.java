package Six;
/*My program has a static method called reverse thate takes an int and displays it in reverse order*/

public class Exersise06_04 {
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


