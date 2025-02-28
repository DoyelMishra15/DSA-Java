package forLoop;

import java.util.Scanner;

public class AnotCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program to Print 1 to N Numbers");
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nProgram to Print N to 1 Numbers");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nProgram to print ASCII Values from A-Z");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " : " + (int) ch);
        }

        System.out.println("\nProgram to print ASCII values of 0-9");
        for (char ch = '0'; ch <= '9'; ch++) {
            System.out.println(ch + " : " + (int) ch);
        }

        System.out.println("\nProgram to display ASCII character set");
        for (int i = 0; i <= 127; i++) {
            System.out.println(i + " : " + (char) i);
        }

        System.out.println("\nProgram to print square values for numbers 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "^2 = " + (i * i));
        }

        System.out.println("\nProgram to print cube values for numbers 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "^3 = " + (i * i * i));
        }

        System.out.println("\nFind Sum of First N Numbers");
        int sum = (N * (N + 1)) / 2;
        System.out.println("Sum: " + sum);

        System.out.println("\nProgram to Find Factorial of Number");
        long factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + N + " is: " + factorial);

        System.out.println("\nProgram to print numbers divisible by 7 between 20 and 60");
        for (int i = 20; i <= 60; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("\nProgram to print numbers divisible by 3 and not by 5 between 10 to 50");
        for (int i = 10; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("\nProgram to print numbers divisible by 4 and not 100 from 100 to 300");
        for (int i = 100; i <= 300; i++) {
            if (i % 4 == 0 && i % 100 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("\nProgram to print numbers which are not divisible by 5 from 30 to 70");
        for (int i = 30; i <= 70; i++) {
            if (i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("\nProgram to print even numbers from 1 to 30 which are not divisible by 5");
        for (int i = 2; i <= 30; i += 2) {
            if (i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("\nProgram to display Multiplication table");
        System.out.print("Enter a number for multiplication table: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        System.out.println("\nPrint Even Numbers from 1 to 10");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nFind Sum of Even Numbers in Java");
        int evenSum = 0;
        for (int i = 2; i <= N; i += 2) {
            evenSum += i;
        }
        System.out.println("Sum of even numbers from 1 to " + N + " is: " + evenSum);

        System.out.println("\nProgram to print factors of given number");
        System.out.print("Enter a number to find its factors: ");
        int factorNum = scanner.nextInt();
        for (int i = 1; i <= factorNum; i++) {
            if (factorNum % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("\nProgram to count factors of given number");
        int count = 0;
        for (int i = 1; i <= factorNum; i++) {
            if (factorNum % i == 0) {
                count++;
            }
        }
        System.out.println("Total number of factors: " + count);

        System.out.println("\nProgram to find the sum of factors of given number");
        int sumFactors = 0;
        for (int i = 1; i <= factorNum; i++) {
            if (factorNum % i == 0) {
                sumFactors += i;
            }
        }
        System.out.println("Sum of factors: " + sumFactors);

        System.out.println("\nProgram to check the input number is Prime or Not");
        boolean isPrime = true;
        if (factorNum < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(factorNum); i++) {
                if (factorNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(factorNum + " is " + (isPrime ? "a Prime Number" : "Not a Prime Number"));

        scanner.close();
    }
}
