package conditional;

public class bill_if5000 {
    public static void main (String args[])
    {
        double bill = 8000;
        if  (bill>=5000){
            bill = bill - (0.2 * bill);
        }
        System.out.println("Total bill is: RS " + bill);
    }
}
