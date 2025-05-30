
public class StarTrianglePattern {
    public static void main(String[] args) {
        System.out.println();
        
        System.out.println("Pattern 1: ");
        for(int i = 1; i<=5 ; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 2: ");
        for(int i = 5; i>=1 ; i--){
            for(int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 3: ");
        for(int i = 1; i<=5 ; i++){
            for(int s = 1; s<=5-i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 3: ");
        for(int i = 1; i<=5 ; i++){
            for(int s = 1; s<=i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
