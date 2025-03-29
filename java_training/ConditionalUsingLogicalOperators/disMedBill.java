package java_training.ConditionalUsingLogicalOperators;

//Give 10% discount on the medical bill only if the bill is greater than or equal to 1500
//and the customer has a membership

import java.util.Scanner;

public class disMedBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter bill amount: ");
        double bill = scan.nextDouble();
        System.out.println("Membership(T/F): ");
        char membership = scan.next().charAt(0);
        if (bill>=1500 && (membership == 'T'|| membership == 't')){
            bill = bill - (0.1 * bill);
        }
        System.out.println("Bill: " + bill);
        scan.close();
    }
}
