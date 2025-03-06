package rangeBased_prog;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("\nProgram to Display the Last digit of given number:");
        System.out.println("Last digit is: " + (n % 10));

        System.out.println("\nProgram to Remove the Last digit of given number:");
        System.out.println("Removing the last digit: " + (n / 10));

        System.out.println("\nProgram to count the digits in the given number:");
        int num = n, count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Digit count: " + count);

        System.out.println("\nProgram to find the sum of digits in the given number:");
        num = n;
        int sum = 0, d;
        while (num > 0) {
            d = num % 10;
            sum += d;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);

        System.out.println("\nProgram to check if the last digit is even or odd:");
        d = n % 10;
        System.out.println(d % 2 == 0 ? "Even number" : "Odd number");

        System.out.println("\nProgram to display only even digits in the given number:");
        num = n;
        System.out.print("Even digits: ");
        while (num > 0) {
            d = num % 10;
            if (d % 2 == 0) {
                System.out.print(d + " ");
            }
            num /= 10;
        }
        System.out.println();

        System.out.println("\nProgram to find the sum of even digits in the given number:");
        num = n;
        int sumEven = 0;
        while (num > 0) {
            d = num % 10;
            if (d % 2 == 0) {
                sumEven += d;
            }
            num /= 10;
        }
        System.out.println("Sum of even digits: " + sumEven);

        System.out.println("\nProgram to count even digits in the given number:");
        num = n;
        int evenCount = 0;
        while (num > 0) {
            d = num % 10;
            if (d % 2 == 0) {
                evenCount++;
            }
            num /= 10;
        }
        System.out.println("Even digit count: " + evenCount);

        System.out.println("\nProgram to find the largest digit in the given number:");
        num = n;
        int maxDigit = 0;
        while (num > 0) {
            d = num % 10;
            if (d > maxDigit) {
                maxDigit = d;
            }
            num /= 10;
        }
        System.out.println("Largest digit: " + maxDigit);

        System.out.println("\nProgram to find the smallest digit in the given number:");
        num = n;
        int minDigit = 9;
        while (num > 0) {
            d = num % 10;
            if (d < minDigit) {
                minDigit = d;
            }
            num /= 10;
        }
        System.out.println("Smallest digit: " + minDigit);

        sc.close();
    }
}