package java_training.scannerClass;

import java.util.Scanner;

public class read2numndadd {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 2 numbers:");
    int x = scan.nextInt();
    int y = scan.nextInt();
    System.err.println("Sum = " + (x+y));
    scan.close();
}  
}