package java_training.rangeBased_prog;

public class lastDig {
    public static void main(String[] args) {
        int n = 321875;

        System.out.println("Program to Display the Last digit of given number");
        System.out.println("Last digit is: " + (n % 10));

        System.out.println("Program to Remove the Last digit of given number:");
        System.out.println("Removing the last digit: " + (n / 10));

        System.out.println("Program to count the digits in given number");
        int num = n;
        int count1 = 0;
        while (num != 0) {
            num /= 10;
            count1++;
        }
        System.out.println("Count is: " + count1);

        System.out.println("Program to find the sum of digits in given number");
        num = n;
        int d = 0; // Declaring 'd' properly
        int sum1 = 0;
        while (num > 0) {
            d = num % 10;
            sum1 += d;
            num /= 10;
        }
        System.out.println("Sum is " + sum1);

        // Checking if the last digit is even or odd
        System.out.println("Program to check if the last digit is even or odd");
        d = n % 10;
        if (d % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // Displaying only even digits from the number
        System.out.println("Program to display only even digits in the given number:");
        num = n;
        System.out.print("Even digits: ");
        while (num > 0) {
            d = num % 10;
            if (d % 2 == 0) {
                System.out.print(d + " ");
            }
            num /= 10;
        }
        System.out.println(); // To move to a new line after printing even digits

        // Finding the sum of even digits
        System.out.println("Program to find the sum of even digits in the given number:");
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

        // Counting even digits in the number
        System.out.println("Program to count even digits in the given number:");
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

        // Finding the largest digit in the number
        System.out.println("Program to find the largest digit in the given number:");
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
    }
}