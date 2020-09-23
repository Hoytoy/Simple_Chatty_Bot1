import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int nextNum = scanner.nextInt();
        int sum = 0;

        while (nextNum != 0) {
            sum += nextNum;
            nextNum = scanner.nextInt();
        }

        System.out.println(sum);
    }
}