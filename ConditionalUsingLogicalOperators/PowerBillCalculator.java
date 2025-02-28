package ConditionalUsingLogicalOperators;

import java.util.Scanner;

public class PowerBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.3;
        } else if (units <= 200) {
            bill = (100 * 1.3) + (units - 100) * 1.8;
        } else if (units <= 300) {
            bill = (100 * 1.3) + (100 * 1.8) + (units - 200) * 2.3;
        } else {
            bill = (100 * 1.3) + (100 * 1.8) + (100 * 2.3) + (units - 300) * 3.4;
        }

        System.out.println("Total Power Bill: ₹" + bill);
        scanner.close();
    }
}