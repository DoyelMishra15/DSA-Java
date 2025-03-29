package java_training.ConditionalUsingLogicalOperators;

//Display Number of Days for the given valid month.

import java.util.Scanner;

public class Num_months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        if (month == 2){
            System.out.println("@8/29 Days");
        }
        else if(month==2||month==4||month==6||month==9||month==11){
            System.out.println("30 Days");
        }
        else{
            System.out.println("31 Days");
        }
        scanner.close();
    }
}
