package rangeBased_prog;

public class lastdigit1 {
    public static void main(String[] args) {
        int n = 321875;
        
        // Smallest digit in the given number
        System.out.println("Program to find the smallest digit in the given number:");
        int num = n, minDigit = 9;
        while (num > 0) {
            int d = num % 10;
            if (d < minDigit) {
                minDigit = d;
            }
            num /= 10;
        }
        System.out.println("Smallest digit: " + minDigit);

        // Check if the number contains zero
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
            int d = num % 10;
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
            int d = num % 10;
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
    }
}