package java_training.arithmetic_operators;

//to remove the last digit

public class remove_lastdigit {
    public static void main(String args[]){
        int n = 23452;
        System.out.println("Before removing last digit: " + n);
        n = n / 10;
        System.out.println("After removing last digit: " + n);
        }
}
