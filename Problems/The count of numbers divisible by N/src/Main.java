import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int lastNum = scanner.nextInt();
        int divisor = scanner.nextInt();

        int range = lastNum - firstNum + (firstNum % divisor);

        int count = range / divisor + (firstNum % divisor == 0 ? 1 : 0);

        System.out.println(count);
    }
}