package Sevan;

import java.util.ArrayList;
import java.util.Scanner;

public class assignGeades {
    public static void main(String[] args) {
        calculateGrades(enterGrades());
    }

    public static int[] enterGrades() {
        Scanner scanner = new Scanner(System.in);

        int students = 0;
        while (students <=0) {
            System.out.println("Enter number of students: ");
            students = scanner.nextInt();
        }
        scanner.nextLine();
        int[] grades = new int[students];
        System.out.println("Enter "+students+" grades");
        String numbers = scanner.nextLine();
        String[] numbersArray =  numbers.split(" ");
        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        for (String s: numbersArray) {
            numbersArrayList.add(Integer.parseInt(s));
        }
        for (int i = 0; i< students;i++) {
            grades[i] = numbersArrayList.get(i);
        }
        return grades;
    }

    public static void calculateGrades(int[] grades) {
        int best = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (best <= grades[i]) {
                best = grades[i];
            }
        }

        for (int i = 0; i < grades.length;i++) {
            if (grades[i] >= best-10) {
                System.out.println("Student " + i+ " score is "
                + grades[i]+ " and grade is A");
                continue;
            }
            if (grades[i] >= best-20) {
                System.out.println("Student " + i+ " score is "
                        + grades[i]+ " and grade is B");
                continue;
            }
            if (grades[i] >= best-30) {
                System.out.println("Student " + i+ " score is "
                        + grades[i]+ " and grade is C");
                continue;
            }
            if (grades[i] >= best-40) {
                System.out.println("Student " + i+ " score is "
                        + grades[i]+ " and grade is D");
                continue;
            }
            else {
                System.out.println("Student " + i+ " score is "
                        + grades[i]+ " and grade is F");
            }

        }
    }

}
