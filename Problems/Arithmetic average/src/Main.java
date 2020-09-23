import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        double firstNum = scanner.nextInt();
        double lastNum = scanner.nextInt();
        double count = 0;
        double sum = 0;
        double average;

        for (double i = firstNum; i <= lastNum; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }

        average = sum / count;

        System.out.println(average);
    }
}