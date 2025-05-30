public class Recursion3 {
    void Prints1N(int i, int n){
        if (i>n) return;
        System.out.println(i);
        Prints1N(i+1, n);
    }
    public static void main(String[] args) {
        Recursion3 obj = new Recursion3();
        int n = 4;
        obj.Prints1N(1,n);
    }
}