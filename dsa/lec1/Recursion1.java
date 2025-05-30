public class Recursion1 {
    void Prints(int n){
        if (n<1) {
            return;
        }
        System.out.println(n);
        Prints(n-1);
    }
    public static void main(String[] args) {
        recursion1 obj = new recursion1();
        obj.Prints(5);
    }
}
