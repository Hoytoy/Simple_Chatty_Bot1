import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int nextNum;

        while ((nextNum = scanner.nextInt()) != 0) {
            sum += nextNum;

            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }

        System.out.println(sum);
    }
}