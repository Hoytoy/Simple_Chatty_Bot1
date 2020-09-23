import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int firstIndex = scanner.nextInt();
        int lastIndex = scanner.nextInt() + 1;

        System.out.println(string.substring(firstIndex, lastIndex));
    }
}