

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Pattern 1:");
        for(int i =1;i<=n; i++){
            for(int j = 1; j<=n ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern 2:");

        for(int i =1;i<=n; i++){
            for(int j = 1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 3:");
        
        for(int i =1;i<=n; i++){
            for(int j = 1; j<=i ;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 4:");
        
        for(int i =1;i<=n; i++){
            for(int j = 1; j<=i ;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 5:");
        
        for(int i =5; i>=0 ; i--){
            for(int j = 1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 6:");
        
        for(int i =5; i>=0 ; i--){
            for(int j = 1; j<=i ;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 7:");
        
        for(int i =1; i<=n ; i++){
            for(int s = 0; s<= n - i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j<= 2*i -1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //same pyramid pattern

        /*for(int i =0; i<n ; i++){
            for(int s = 0; s<= n - i - 1; s++){
                System.out.print(" ");
            }
            for(int j = 0; j< 2 * i + 1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        } */

        System.out.println();
        System.out.println("Pattern 8:");
        
        for(int i = n; i>=0 ; i--){
            for(int s = 0; s<= n - i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j<= 2*i -1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 9:");

        //combining above two into one
        
        for(int i =1; i<=n ; i++){
            for(int s = 0; s<= n - i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j<= 2*i -1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n ; i>=0 ; i--){
            for(int s = 0; s<= n - i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j<= 2*i -1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*for(int i =1; i<=n ; i++){
            for(int s = 0; s<= n - i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j<= 2*i -1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1; i>=0 ; i--){
            for(int s = 0; s<= n - i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j<= 2*i -1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        } */

        System.out.println();
        System.out.println("Pattern 10:");

        for(int i =1;i<=n; i++){
            for(int j = 1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =n;i>=0; i--){
            for(int j = 1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 11:");

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i ;j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 12:");
        
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print(j);
            }
            for(int k = 0; k<=n - i -1 ; k++){
                System.out.print(" ");
            }
            for(int k = n - i -1 ; k>=0 ; k--){
                System.out.print(" ");
            }
            for(int l = i; l>0 ; l--){
                System.out.print(l);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 13:");

        int x = 1;
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<=i ; j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 14:");
        
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print((char)('A'+j - 1));
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 15:");

        for(int i = n; i>=0 ; i--){
            for(int j = 1; j<=i ; j++){
                System.out.print((char)('A'+j - 1));
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 16:");
        
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print((char)('A'+i - 1));
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Pattern 17:");
        
        for(int i =1; i<=n ; i++){
            for(int s = 0; s<= n - i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j<= i  ;j++){
                System.out.print((char)('A'+j-1));
            }
            for(int j = i - 1; j > 0  ; j--){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 18:");
        
        for(char i ='E'; i>= 'A' ; i--){
            for(char j = i ; j<= 'E' ;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 19:");

        for(int i = n; i>=1 ; i--){
            for(int j = 1; j<=i ;j++){
                System.out.print("*");
            }
            for(int k = 1; k <= n - i; k++){
                System.out.print(" ");
            }
            for(int k = n - i; k>0 ;k--){
                System.out.print(" ");
            }
            for(int l=1 ; l<= i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i ;j++){
                System.out.print("*");
            }
            for(int k = 1; k <= n - i; k++){
                System.out.print(" ");
            }
            for(int k = n - i; k>0 ;k--){
                System.out.print(" ");
            }
            for(int l=1 ; l<= i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 20");
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i ;j++){
                System.out.print("*");
            }
            for(int k = 1; k <= n - i; k++){
                System.out.print(" ");
            }
            for(int k = n - i; k>0 ;k--){
                System.out.print(" ");
            }
            for(int l=1 ; l<= i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i>=1 ; i--){
            for(int j = 1; j<=i ;j++){
                System.out.print("*");
            }
            for(int k = 1; k <= n - i; k++){
                System.out.print(" ");
            }
            for(int k = n - i; k>0 ;k--){
                System.out.print(" ");
            }
            for(int l=1 ; l<= i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 21");
        for(int i = 0; i<n ; i++){
            for(int j = 0; j< n ;j++){
                if (i==0 || i==n-1 || j==0 || j== n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 21");
        for(int i = 0; i<2*n - 1 ; i++){
            for(int j = 0; j<2*n - 1 ;j++){
                int value = n - Math.min(Math.min(i, j), Math.min(2*n - 1 - 1 - i, 2*n - 1 - 1 - j));
                System.out.print(value);
            }
            System.out.println();
        }

        sc.close();
    }
}