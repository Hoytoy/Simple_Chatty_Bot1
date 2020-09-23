import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int nextNum = scanner.nextInt();

        while (nextNum != 0) {
            count++;
            nextNum = scanner.nextInt();
        }

        System.out.println(count);
    }
}