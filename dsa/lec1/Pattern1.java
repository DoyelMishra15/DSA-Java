

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Pattern 1: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if (i==1||i==7||j==1||j==7) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 2: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if (i==4||j==4) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 3: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if (i==1||i==7||j==1||j==7||i==4||j==4) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 4: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if (i==j) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 5: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if (i+j==8) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 6: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if (i+j==8||i==j) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 7: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if (i+j==8||i==j||i==1||i==7||j==1||j==7) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 8: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if ((i==1&&j<=4)||(i==7&&j>=4)||j==4) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 9: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if ((j==1&&i>=4)||(j==7&&i<=4)||i==4) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 9: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if ((j==1&&i>=4)||(j==7&&i<=4)||(i==1&&j<=4)||(i==7&&j>=4)||j==4||i==4) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 10: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if ((i==j && j<=4)||(i+j==8 && j>=4)|| (i>=4 && j==4)) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 11: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if ((j==4&& i<=4)||(i+j==8&&j<=4)|| (i==j&& j>=4)) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 12: ");
        for(int i= 1; i<=9; i++){
            for(int j= 1; j<=9; j++){
                if ((i+j==6&&j<=5&&i<=5)||(i+j==14&&j>=5&&i>=5)||(i-j==4&&j<=5&&i>=5)||(j-i==4&&j>=5&&i<=5)) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 13: ");
        for(int i= 1; i<=9; i++){
            for(int j= 1; j<=9; j++){
                if ((i==1&&j>=5)||j==5||i==5||(j==1&&i<=5)||(j==9&&i>=5)||(i==9&&j<=5)) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        /*System.out.println("Pattern 14: ");
        
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                if () {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        System.out.println();

        System.out.println("Pattern 15: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if ((i+j==5&&i<=3)||j==4||i==7) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 16: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if (i==1||i==7||i==4||(j==7&&i<=4)||(j==1&&i>=4)) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 17: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if (i==1||i==7||i==4||j==7) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 18: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if (j==5||(i+j==6&&i<=5)|| i== 5) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        
        System.out.println("Pattern 19: ");
        for(int i= 1; i<=7; i++){
            for(int j= 1; j<=7; j++){
                if (i==1||i==4|| i== 7||(i<=4&&j==1)||(i>=4&&j==7)) {
                    System.out.print("+");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
