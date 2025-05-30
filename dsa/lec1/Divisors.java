

public class Divisors {
    public static void main(String[] args) {
        int n = 334;
        System.out.println("Printing All divisors: ");
        for (int i = 1; i <=n ; i++ ) {
            if (n % i == 0){
                System.out.println(i);
            }
        }
    }
}
