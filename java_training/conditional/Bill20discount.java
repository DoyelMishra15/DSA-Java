package java_training.conditional;

public class Bill20discount {
    public static void main (String args[])
    {
        double bill = 1000;
        bill = bill - (0.2 * bill);
        System.out.println("Total bill is: RS " + bill);
    }
}
