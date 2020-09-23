import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        long smallest = 1;
        long result = 1;

        while (result <= num) {
            smallest++;
            result *= smallest;
        }

        System.out.println(smallest);
    }
}