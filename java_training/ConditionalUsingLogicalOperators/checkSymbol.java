package java_training.ConditionalUsingLogicalOperators;

import java.util.Scanner;

public class checkSymbol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scan.next().charAt(0);
        if (!(ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
            System.out.println(ch + " is a symbol.");
        } else {
            System.out.println(ch + " is not a symbol.");
        }
        scan.close();
    }
}
