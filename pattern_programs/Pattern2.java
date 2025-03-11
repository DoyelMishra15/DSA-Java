package pattern_programs;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("$");
                }
            }
            System.out.println();
        }
        
        System.out.println();

        System.out.println("Pattern 2:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("$");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern 3:");
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(k++ % 10);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern 4:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(j);
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}