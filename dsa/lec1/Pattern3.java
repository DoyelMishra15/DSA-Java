

public class Pattern3 {
    public static void main(String[] args) {
        System.out.println();
        
        System.out.println("Pattern 1: ");
        for(char i = 'A';i<='E' ; i++){
            for(char j = 'A'; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        } 
        
        System.out.println();
        
        System.out.println("Pattern 2: ");
        for(char i = 'A';i<='E' ; i++){
            for(char j = i; j>='A' ; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 3: ");
        for(char i = 'E';i>='A' ; i--){
            for(char j = 'A'; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 4: ");
        for(char i = 'A';i<='E' ; i++){
            for(char j = i; j<='E' ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 4: ");
        for(char i = 'A';i<='E' ; i++){
            for(char j = i; j<='E' ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 4: ");
        for(char i = 'E';i>='A' ; i--){
            for(char j = 'E' ; j>= i ; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 5: ");
        for(char i = 'E';i>='A' ; i--){
            for(char j = i ; j>='A'  ; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 6: ");
        for(char i = 'A';i <= 'E' ; i++){
            for(char j = 'E' ; j>=i  ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
