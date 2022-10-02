package Six;

public class pentagonalNumbers {

    public static void main(String[] args) {
        int number = getPentagonalNumber(3);
        System.out.println(number);
    }

    public static int getPentagonalNumber(int number) {
        int pentNumber = number*((3*number)-1)/2;
        return pentNumber;
    }
}
