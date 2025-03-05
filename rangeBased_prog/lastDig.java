package rangeBased_prog;

public class lastDig {
    public static void main(String[] args) {
        int n = 321875;

        System.out.println("Program to Display the Last digit of given number");
        System.err.println("last digit is : "+(n%10));

        System.out.println("Program to Remove the Last digit of given number:");
        System.err.println("Removing the last digit: " + (n/10));

        System.out.println("Program to count the digits in given number");
        int num = n;
        int count1 = 0;
        while (num!= 0) {
            num /= 10;
            count1++;            
        }
        System.out.println("Count is: "+ count1);

        System.out.println("Program to find the sum of digits in given number");
        num = n;
        int sum1=0;
        while(num>0){
            int d1 = num%10;
            sum1 += d1;
            num /= 10;
        }
        System.out.println("Sum is "+ sum1);
    }
}
