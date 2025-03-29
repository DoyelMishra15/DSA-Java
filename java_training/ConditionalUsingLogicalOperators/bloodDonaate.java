package java_training.ConditionalUsingLogicalOperators;

//Check the Number Person Can donate blood or not (weight between 55 to 90)

import java.util.Scanner;

public class bloodDonaate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Weight(in kg): ");
        double w = scan.nextDouble();
        if (w>=55 && w<=90) {
            System.out.println("Can donate blood!!");
        }
        else{
            System.out.println("Can NOT donate blood!!");
        }
        scan.close();
    }
}
