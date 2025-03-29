package java_training.ConditionalUsingLogicalOperators;
import java.util.Scanner;
public class checkNumDig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        if (num >= -9 && num <= 9) {
            System.out.println(num + " is a Single-digit number.");
        } else if (num >= -99 && num <= 99) {
            System.out.println(num + " is a Two-digit number.");
        } else if (num >= -999 && num <= 999) {
            System.out.println(num + " is a Three-digit number.");
        } else {
            System.out.println(num + " is an Other-digit number (more than 3 digits).");
        }
        scan.close();
    }
}
