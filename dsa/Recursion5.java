public class Recursion5 {
    void sum(int n){
        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Recursion5 obj = new Recursion5();
        int n = 4;
        obj.sum(n);
    }
}