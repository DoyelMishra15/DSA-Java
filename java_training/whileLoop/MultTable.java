package java_training.whileLoop;

import java.util.Scanner;

public class MultTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number to print table: ");
            int num = scan.nextInt();
            
            for(int i = 1; i<=10; i++){
                System.out.println(num + " * " + i + " = " + (num*i));
            }

            System.out.print("Do you want another table? (y/n): ");
            char ch = scan.next().charAt(0);

            if (ch == 'n' || ch == 'N') {
                break;
            }
        }

        System.out.println("Exiting program.");
        scan.close();
    }
}
