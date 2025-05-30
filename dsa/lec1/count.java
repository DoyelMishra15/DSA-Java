

public class count {
    public static void main(String[] args) {
        int n = 123321;
        int temp = n;
        int count1 = 0;
        System.out.println("counting number of digits: ");
        while(temp > 0){
            count1++;
            temp =temp/10;
    }
        System.out.println("number of digits: "+count1);
        System.out.println("reverse of the num: ");

        temp = n;
        int reverse=0;
        while (temp>0) {
            reverse = reverse * 10 + (temp%10);
            temp /= 10;
        }
        System.out.println("reverse of the num: "+reverse);

        System.out.println("check the num for palindrome: ");
        temp = n;
        reverse =0;
        while (temp>0) {
            reverse = reverse * 10 + (temp%10);
            temp /= 10;
        }
        if (reverse==n) {
            System.out.println("A palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
