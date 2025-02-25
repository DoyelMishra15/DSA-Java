package arithmetic_operators;

//swapping two numbers

public class swapping {
    public static void main(String args[]){
        int n = 23, m = 45;
        System.out.println("Using third variable: ");
        System.out.println("Before swapping n: " + n + " and m: " + m);

        int c = n;
        n = m;
        m = c;
        System.out.println("After swapping n: " + n + " and m: " + m);

        System.out.println();

        System.out.println("Without Using third variable: ");
        int a = 65, b = 87;
        System.out.println("Before swapping a: " + a + " and b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a: " + a + " and b: " + b);

        }
}
