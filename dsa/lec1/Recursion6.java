public class Recursion6 {
    static void fact(int n){
        int p = 1;
        for(int i = 1; i<=n;i++){
            p = p * i;
        }
        System.out.println(p);
    }
    public static void main(String[] args) {
        int n = 4;
        Recursion6.fact(n);
    }
}
