package ConditionalUsingLogicalOperators;

//Check the Character is Vowel or Not

import java.util.Scanner;

public class checkVowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a char: ");
        char ch  = scan.next().charAt(0);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
            ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } 
        else {
            System.out.println(ch + " is not a vowel.");
        }
        scan.close();
    }
}
