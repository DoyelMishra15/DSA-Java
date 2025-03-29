package java_training.ConditionalUsingLogicalOperators;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int sub1 = scan.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int sub2 = scan.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int sub3 = scan.nextInt();

        if (sub1 >= 40 && sub2 >= 40 && sub3 >= 40) {
            int average = (sub1 + sub2 + sub3) / 3;

            if (average >= 90) {
                System.out.println("Grade: A");
            } else if (average >= 75) {
                System.out.println("Grade: B");
            } else if (average >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        } else {
            System.out.println("Student has failed in one or more subjects.");
        }

        scan.close();
    }
}