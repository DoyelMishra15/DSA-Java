package forLoop;

public class Code {
    public static void main(String[] args) {
        System.out.println("Program to Print 1 to 10 Numbers");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i val : " + i);
        }

        System.out.println("\nProgram to Print 10 to 1 Numbers");
        for (int i = 10; i >= 1; i--) {
            System.out.println("i val : " + i);
        }

        System.out.println("\nProgram to display A-Z alphabets");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println(); 

        System.out.println("\nPrint numbers 2, 4, 6, 8, 10");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nPrint numbers 15, 12, 9, 6, 3, 0");
        for (int i = 15; i >= 0; i -= 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nPrint numbers 10, 20, 30, 40, 50");
        for (int i = 10; i <= 50; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nPrint numbers 100, 80, 60, 40, 20");
        for (int i = 100; i >= 20; i -= 20) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nProgram to display a-z alphabets");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}