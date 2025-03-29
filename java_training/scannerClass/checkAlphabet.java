package java_training.scannerClass;

import java.util.Scanner;

public class checkAlphabet {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter characters:");
        char x = scan.next().charAt(0);
        if ((x>='A' && x<='Z')||(x>='a' && x<='z')){
            System.err.println("It is an Alphabet");
        }
        else{
            System.err.println("It is not an alphabet");
        }
        scan.close();
}
}