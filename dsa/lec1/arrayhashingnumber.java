import java.util.Scanner;

public class arrayhashingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of elements in array: ");
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input array element["+i+"]");
            arr[i] = sc.nextInt();
        }

        //precompute:
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        System.out.println("Number of queries: ");
        int q;
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            // fetching:
            System.out.println("Frequency of "+number+" is " +hash[number]);
        }
        sc.close();
    }
}
