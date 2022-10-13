package Six;
/*This program calculates pentagonal numbers based off the provided formula. I used a static method
* that takes a number and returns it's equivilent pentagonal number*/
public class Exersise06_01 {

    public static void main(String[] args) {
        int number = getPentagonalNumber(3);
        System.out.println(number);
    }

    public static int getPentagonalNumber(int number) {
        int pentNumber = number*((3*number)-1)/2;
        return pentNumber;
    }
}
