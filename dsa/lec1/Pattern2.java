
public class Pattern2 {
    public static void main(String[] args) {
        System.out.println();
        
        System.out.println("Pattern 1: ");
        for(int i= 1; i<=5; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 2: ");
        for(int i= 1; i<=5; i++){
            for(int j= i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 3: ");
        for(int i= 5; i>=1; i--){
            for(int j= 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 4: ");
        for(int i= 1; i<=5; i++){
            for(int j= i; j<=5; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 5: ");
        for(int i= 5; i>=1; i--){
            for(int j= 5; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 6: ");
        for(int i= 5; i>=1; i--){
            for(int j= i; j<=5; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 7: ");
        for(int i= 1; i<=5; i++){
            for(int j= 5; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 8: ");
        for(int i= 5; i>=1; i--){
            for(int j= i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 9: ");
        for(int i= 1; i<=5; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 9: ");
        for(int i= 1; i<=5; i++){
            for(int j= 5; j>=i; j--){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 9: ");
        for(int i= 5; i>=1; i--){
            for(int j= 5; j>=i; j--){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 9: ");
        for(int i= 5; i>=1; i--){
            for(int j= 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();
        int x=1;
        System.out.println("Pattern 10: ");
        for(int i= 1; i<=5; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(x);
                x++;
                if (x>9){
                    x = 1;
                }
            }
            System.out.println();
        }

        System.out.println();

        x=1;
        
        System.out.println("Pattern 11: ");
        for(int i= 5; i>=1; i--){
            for(int j= i; j>=1; j--){
                System.out.print(x);
                x++;
                if (x>9){
                    x = 1;
                }
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 12: ");
        for(int i= 1; i<=5; i++){
            for(int s= 5-i ; s>=1; s--){
                System.out.print(" ");
            }
            for(int j= i ; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 13: ");
        for(int i= 5; i>=1; i--){
            for(int s= 1 ; s<=5-i; s++){
                System.out.print(" ");
            }
            for(int j= 1 ; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 14: ");
        for(int i= 1; i<=5; i++){
            for(int s= 0; s< i-1; s++){
                System.out.print(" ");
            }
            for(int j= i ; j<=5; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 15: ");
        for(int i= 5; i>=1; i--){
            for(int s= 1 ; s< i; s++){
                System.out.print(" ");
            }
            for(int j= i ; j<=5; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 16: ");
        for(int i= 5; i>=1; i--){
            for(int s= 1 ; s< i; s++){
                System.out.print(" ");
            }
            for(int j= 5 ; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 17: ");
        for(int i= 1; i<=5; i++){
            for(int s= 1 ; s< i; s++){
                System.out.print(" ");
            }
            for(int j= 5 ; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 18: ");
        for(int i= 5; i>=1; i--){
            for(int s= 1 ; s<= 5 - i; s++){
                System.out.print(" ");
            }
            for(int j= i ; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
