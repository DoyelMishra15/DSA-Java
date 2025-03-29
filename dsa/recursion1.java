package dsa;

public class recursion1 {
    //stack overflow- A Stack Overflow occurs when a program's call stack 
    //exceeds its allocated memory limit, causing the program to crash. This typically happens due to infinite recursion or excessive function calls without returning.
    void Prints(int n){
        if (n==0) return;
        System.out.println(n);
        Prints(n-1);
    }
    public static void main(String[] args) {
        recursion1 ps = new recursion1();
        ps.Prints(5);
    }
}