package DSA.lec3array;

import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input N: ");

        int N = sc.nextInt();

        int[] arr ={1, 2, 3};

        int expected = (N*(N+1))/2, actual=0;

        for(int i = 0; i < arr.length ; i++){
            actual+=arr[i];
        }
        
        int missing = expected - actual;

        System.out.println("The missing element is: "+ missing);

        sc.close();
    }
}
