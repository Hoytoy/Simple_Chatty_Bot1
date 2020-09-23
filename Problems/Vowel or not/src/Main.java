import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        boolean vowel = false;

        if (ch == 'A' || ch == 'a') {
            vowel = true;
        } else if (ch == 'E' || ch == 'e') {
            vowel = true;
        } else if (ch == 'I' || ch == 'i') {
            vowel = true;
        } else if (ch == 'O' || ch == 'o') {
            vowel = true;
        } else if (ch == 'U' || ch == 'u') {
            vowel = true;
        }

        return vowel;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}