package java_training.whileLoop;
import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }

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