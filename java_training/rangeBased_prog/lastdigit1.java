package java_training.rangeBased_prog;

public class lastdigit1 {
    public static void main(String[] args) {
        int n = 321875;
        int num, d;

        // Finding the smallest digit
        System.out.println("Program to find the smallest digit in the given number:");
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

        // Checking if the number contains zero
        System.out.println("Program to check if the number contains zero:");
        num = n;
        boolean containsZero = false;
        while (num > 0) {
            if (num % 10 == 0) {
                containsZero = true;
                break;
            }
            num /= 10;
        }
        System.out.println("Contains zero: " + (containsZero ? "Yes" : "No"));

        // Finding the average of all digits
        System.out.println("Program to find the average of all digits in the given number:");
        num = n;
        int sum = 0, count = 0;
        while (num > 0) {
            sum += num % 10;
            count++;
            num /= 10;
        }
        double average = (double) sum / count;
        System.out.println("Average of digits: " + average);

        // Finding the second largest digit
        System.out.println("Program to find the second largest digit in the given number:");
        num = n;
        int largest = -1, secondLargest = -1;
        while (num > 0) {
            d = num % 10;
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
            num /= 10;
        }
        System.out.println("Second largest digit: " + secondLargest);

        // Finding the second smallest digit
        System.out.println("Program to find the second smallest digit in the given number:");
        num = n;
        int smallest = 9, secondSmallest = 9;
        while (num > 0) {
            d = num % 10;
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
            num /= 10;
        }
        System.out.println("Second smallest digit: " + secondSmallest);

        // Finding the first digit
        System.out.println("Program to find the first digit in the given number:");
        num = n;
        while (num >= 10) {
            num /= 10;
        }
        System.out.println("First digit: " + num);

        // Finding the sum of first and last digits
        System.out.println("Program to find the sum of first and last digits in the given number:");
        int firstDigit = num;
        int lastDigit = n % 10;
        System.out.println("Sum of first and last digits: " + (firstDigit + lastDigit));

        // Multiplication table for each digit
        System.out.println("Program to display multiplication table for each digit in the given number:");
        num = n;
        while (num > 0) {
            d = num % 10;
            System.out.println("Multiplication table for " + d + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(d + " * " + i + " = " + (d * i));
            }
            num /= 10;
        }

        // Finding factorial of each digit
        System.out.println("Program to find factorial value for each digit in the given number:");
        num = n;
        while (num > 0) {
            d = num % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + d + " is " + fact);
            num /= 10;
        }

        // Displaying square and cube values for each digit
        System.out.println("Program to display square and cube values for each digit in the given number:");
        num = n;
        while (num > 0) {
            d = num % 10;
            System.out.println("Digit: " + d + " | Square: " + (d * d) + " | Cube: " + (d * d * d));
            num /= 10;
        }

        // Displaying only prime digits
        System.out.println("Program to display only prime digits in the given number:");
        num = n;
        System.out.print("Prime digits: ");
        while (num > 0) {
            d = num % 10;
            if (d == 2 || d == 3 || d == 5 || d == 7) {
                System.out.print(d + " ");
            }
            num /= 10;
        }
        System.out.println();

        // Reversing the number
        System.out.println("Program to reverse the given number:");
        num = n;
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}