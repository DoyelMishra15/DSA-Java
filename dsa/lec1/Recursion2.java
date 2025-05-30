public class Recursion2 {
    void printName(int i, int n){
        if (i>n) {
            return;
        }
        System.out.println("GOOD"+ " ");
        printName(i+1, n);
    }

    public static void main(String[] args) {
        Recursion2 obj = new Recursion2();
        int n = 4;
        obj.printName(1,n);
    }
}
