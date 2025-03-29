package java_training.rangeBased_prog;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int temp = x;

        int reverse = 0;

        while (temp !=0) {
            int d = temp % 10;
            reverse = reverse * 10 + d;
            temp = temp/10;
        }
        if (reverse == x) {
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
    sc.close();
    }
}