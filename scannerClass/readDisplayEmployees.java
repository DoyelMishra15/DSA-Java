package scannerClass;

import java.util.Scanner;

public class readDisplayEmployees {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Emp Details:");
        System.out.print("Enter ID: ");
        int empId = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Name: ");
        String empName = scan.nextLine();
        System.out.print("Enter Salary: ");
        double empSalary = scan.nextDouble();
        System.out.println("Details Entered: " + empId + ", " + empName + ", " + empSalary);
        scan.close();
    }
}