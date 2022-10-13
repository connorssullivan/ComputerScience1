package Sevan;

public class strictlyIdentical {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[] same = {1,2,3};
        int[] differnt = {1,2,4};
        int[] diffSize = {1};
        identical(array, same);
        identical(array, differnt);
        identical(array,diffSize);
    }

    public static void identical(int[] array1, int[] array2) {
        boolean cont = true;
        if (array1.length == array2.length) {
            for(int i = 0; i<array1.length;i++) {
                if (array1[i] != array2[i]) {
                    System.out.println("The arrays are not equal");
                    cont = false;
                }
            }
            if (cont == true)
                System.out.println("The arrays are equal");

        }else {
            System.out.println("The arrays are not equal");
        }
    }
}
