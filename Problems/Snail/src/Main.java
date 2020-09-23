import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // put your code here
        int poleHeight = scanner.nextInt();
        int dailyUp = scanner.nextInt();
        int nightlyDown = scanner.nextInt();

        int currentHeight = 0;
        int days = 0;

        while (currentHeight < poleHeight) {
            currentHeight += dailyUp;
            days++;
            if (currentHeight < poleHeight) {
                currentHeight -= nightlyDown;
            }
        }

        System.out.println(days);
    }
}