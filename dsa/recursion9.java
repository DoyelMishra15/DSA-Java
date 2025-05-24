public class recursion9 {
    static void fibonacci(int n){
        int a = 0, b=1;
        System.out.print(a+" "+b+" ");
        for(int i=1; i<=n;i++){
            System.out.print((a+b)+" ");
            int temp = a;
            a = b;
            b = temp+b;
        }
    }
    public static void main(String[] args) {
        int n= 5;
        recursion9.fibonacci(n);
    }
}
