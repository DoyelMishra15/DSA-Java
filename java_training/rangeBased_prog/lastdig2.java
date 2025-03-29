package java_training.rangeBased_prog;

import java.util.Scanner;

public class lastdig2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter exponent (p): ");
        int p = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < p; i++) {
            result *= n;
        }

        System.out.println(n + "^" + p + " = " + result);
        scanner.close();
    }
}
