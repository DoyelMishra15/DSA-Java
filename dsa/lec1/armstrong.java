


public class armstrong {
    public static void main(String[] args) {
        int n = 1635, count = 0, sum = 0;
        int temp = n;

        while (temp>0) {
            count++;
            temp /= 10;
        }

        temp = n;
        while (temp>0) {
            int d = temp%10;
            int power = 1;
            for(int i = 0; i < count; i++){
                power *= d;
            }
            sum += power;
            temp /= 10;
        }

        if (sum==n) {
            System.out.println("ARMSTRONG NUMBER");
        } 
        else 
        {
            System.out.println("not an ARMSTRONG NUMBER");
        }
    }
}
