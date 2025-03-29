package java_training.whileLoop;

import java.util.Scanner;

public class PrimeNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number to check prime: ");
            int num = scan.nextInt();
            int count = 1;
            for(int i = 2; i<=num; i++){
                if (num % i == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.println("Prime Number");
            }
            else{
                System.out.println("NOT prime number");
            }

            System.out.print("Do you want check another number? (y/n): ");
            char ch = scan.next().charAt(0);

            if (ch == 'n' || ch == 'N') {
                break;
            }
        }

        System.out.println("Exiting program.");
        scan.close();
    }
}
