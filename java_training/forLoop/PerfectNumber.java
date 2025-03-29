package java_training.forLoop;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program to check if a number is Perfect or Not");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;

        // Find sum of divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if sum equals the number
        if (sum == num && num > 0) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }

        scanner.close();
    }
}