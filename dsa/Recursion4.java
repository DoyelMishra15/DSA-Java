public class Recursion4 {
    void PrintsN1(int i, int n){
        if (i<n) return;
        System.out.print(i+" ");
        PrintsN1(i-1, n);
    }
    public static void main(String[] args) {
        Recursion4 obj = new Recursion4();
        int i = 4;
        obj.PrintsN1(i,1);
    }
}
