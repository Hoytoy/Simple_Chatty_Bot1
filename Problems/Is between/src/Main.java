import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // put your code here
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int lowerBorder;
        int upperBorder;

        if (num1 <= num2) {
            lowerBorder = num1;
            upperBorder = num2;
        } else {
            lowerBorder = num2;
            upperBorder = num1;
        }

        System.out.println(num >= lowerBorder && num <= upperBorder);
    }
}