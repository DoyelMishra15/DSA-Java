package java_training.rangeBased_prog;

import java.util.Scanner;

public class Armstrong {
    // Function to check if a number is Armstrong
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = 0;
        
        // Count the number of digits
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        
        // Compute the sum of digits raised to the power of total digits
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        // Check if sum is equal to the original number
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check Armstrong number
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
}