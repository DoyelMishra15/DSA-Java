package rangeBased_prog;

public class lastDig {
    public static void main(String[] args) {
        int n = 321875;

        //Program to Display the Last digit of given number
        System.err.println("last digit is : "+(n%10));

        //Program to Remove the Last digit of given number:
        System.err.println("Removing the last digit: " + (n/10));

        //Program to count the digits in given number
        int num = n;
        int count1 = 0;
        while (num!= 0) {
            num /= 10;
            count1++;            
        }
        System.out.println("Count is: "+ count1);
    }
}
