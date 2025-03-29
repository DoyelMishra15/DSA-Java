package java_training.whileLoop;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("1. add");
            System.out.println("2. subtract");
            System.out.println("3. multiply");
            System.out.println("4. divide");
            System.out.println("5. exit");
            System.out.print("Enter your choice : ");
            int ch = scan.nextInt();
            if(ch==1){
                System.out.println("Enter 2 nums : ");
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println("Result = " + (a+b));
            }
            else if(ch==2){
                System.out.println("Enter 2 nums : ");
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println("Result = " + (a-b));
            }
            else if(ch==3){
                System.out.println("Enter 2 nums : ");
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println("Result = " + (a*b));
            }
            else if(ch==4){
                System.out.println("Enter 2 nums : ");
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println("Result = " + (a/b));
            }
            else if(ch==5){
                System.out.println("End of program");
                break;
            }
            else{
                System.out.println("Error : Invalid choice");
            }
        }
        scan.close();
    }
}