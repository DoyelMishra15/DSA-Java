package java_training.conditional;

public class EenoddPos {
    public static void main (String args[]){
        int n = 4;
        if (n>0){
            if  (n % 2 == 0){
                System.out.println("EVEN NUMBER");
            }
            else{
                System.out.println("ODD NUMBER");
            }
        }
        else{
            System.out.println("Requires a positive number");
        }
    }
    
}
