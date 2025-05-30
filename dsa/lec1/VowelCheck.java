
public class VowelCheck {
    public static void main(String[] args) {
        char ch = 'O';  // Example input
        ch = Character.toLowerCase(ch);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is a vowel.");
            default -> System.out.println(ch + " is not a vowel.");

        }

        System.out.println("Character  ASCII Value");
        for (char c = '0'; c <= '9'; c++) {
            System.out.println("   " + c + "  " + (int) c);
        }
    }
}