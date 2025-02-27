package ConditionalUsingLogicalOperators;

import java.util.Scanner;

public class biggestOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the biggest number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the biggest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        scan.close();
    }
}

