import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int square = 1;

        while (square * square <= num) {
            System.out.println(square * square);
            square++;
        }
    }
}