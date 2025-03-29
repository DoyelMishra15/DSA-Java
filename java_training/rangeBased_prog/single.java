package java_training.rangeBased_prog;

import java.util.Scanner;

public class single {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while (num>9) {
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                sum += temp % 10;  // Extract last digit and add to sum
                temp /= 10;  // Remove last digit
            }
            
            num = sum;  // Update num with the new sum
        }
        
        // Print the final single-digit sum
        System.out.println("Final single-digit sum: " + num);
        
        sc.close();
    }
}