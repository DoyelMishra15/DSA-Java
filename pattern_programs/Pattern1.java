package pattern_programs;

public class Pattern1 {
    public static void main(String[] args) {
        // Pattern 1: Increasing numbers row-wise
        System.out.println("Pattern 1:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 2: Same number in each row
        System.out.println("Pattern 2:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 3: Square of asterisks
        System.out.println("Pattern 3:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 4: Decreasing numbers row-wise
        System.out.println("Pattern 4:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 5: Decreasing numbers column-wise
        System.out.println("Pattern 5:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 6: Alternating 1s and 0s (checkerboard)
        System.out.println("Pattern 6:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 7: Alternating 1s and 0s row-wise
        System.out.println("Pattern 7:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 8: Alphabet pattern
        System.out.println("Pattern 8:");
        for (char x = 'A'; x <= 'E'; x++) {
            for (char y = 'A'; y <= 'E'; y++) {
                System.out.print(x);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern 9:");
        for (char x = 'A'; x <= 'E'; x++) {
            for (char y = 'A'; y <= 'E'; y++) {
                System.out.print(y);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern 10:");
        for (char x = 'E'; x >= 'A'; x--) {
            for (char y = 'E'; y >= 'A'; y--) {
                System.out.print(x);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern 11:");
        for (char x = 'E'; x >= 'A'; x--) {
            for (char y = 'E'; y >= 'A'; y--) {
                System.out.print(y);
            }
            System.out.println();
        }
        System.out.println();
    }
}