import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        String replacingString = inputString.replace('a', 'b');

        System.out.println(replacingString);
    }
}