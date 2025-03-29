package java_training.rangeBased_prog;

import java.util.Scanner;

public class AdamNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        //take a number
        int num = sc.nextInt();

        //square the num
        int sq = num * num;
        System.out.println("Square of the number: " + sq);

        int temp = sq;
        int rev = 0;

        //reverse the square number
        while(temp != 0){
            int d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
    }
        System.out.println("Reverse of square: " + rev);

        //find the square root num for the reversed square
        int i = 1;
        while( i * i < rev){
            i++;
        }
        System.out.println("reverse sqr rt: " + i);
        //rev i nd check
        int rev2 = 0;
        int temp2 = i;
        while(temp2 != 0){
            int d = temp2 % 10;
            rev2 = rev2 * 10 + d;
            temp2 = temp2 / 10;
        }
        //check if this and the entered num are same
        if(rev2 == num){
            System.out.println(num + " is an Adam number");
        }
        else{
            System.out.println(num + " is not an Adam number");
        }
    sc.close();
    }
}
