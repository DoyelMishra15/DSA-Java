package java_training.whileLoop;
import java.util.Scanner;
public class read2num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter 2 number: ");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            
            System.err.println("The sum is "+(num1 + num2));

            System.out.print("Do you want to check another number? (y/n): ");
            char ch = scan.next().charAt(0);

            if (ch == 'n' || ch == 'N') {
                break;
            }
        }

        System.out.println("Exiting program.");
        scan.close();
    }
}
