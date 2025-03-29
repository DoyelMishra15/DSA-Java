package java_training.ConditionalUsingLogicalOperators;

//5% Discount on Online Purchase if the Total is Greater Than or Equal to 500 and the 
//Customer is a First-Time Shopper
import java.util.Scanner;

public class Dis5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter purchase amount: ");
        double bill = scan.nextDouble();
        System.out.println("First Time shopping??(Y/N): ");
        char firstTimeShopping = scan.next().charAt(0);
        if (bill>=500 && (firstTimeShopping == 'Y'|| firstTimeShopping == 'y')){
            bill = bill - (0.05 * bill);
        }
        System.out.println("Bill: " + bill);
        scan.close();
    }
}
