package One;
/*This program generates a table with the square and cube root*/
public class Exersize01_04 {
    public static void main(String[] args) {
        int p1 = 1;
        int p2 = 2;
        int p3 = 3;

        System.out.println("a  a^2  a^3");
        for (int i = 1; i< 5;i++ ) {
            System.out.print((int)Math.pow(i, p1) );
            System.out.print("   "+(int)Math.pow(i,p2));
            System.out.print("   "+(int)Math.pow(i,p3));
            System.out.println("");
        }


    }
}
