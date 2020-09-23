import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int temp;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int notPassed = 0;

        for (int i = 0; i < count; i++) {
            temp = scanner.nextInt();
            if (temp == 5) {
                countA++;
            } else if (temp == 4) {
                countB++;
            } else if (temp == 3) {
                countC++;
            } else if (temp == 2) {
                countD++;
            } else {
                notPassed++;
            }
        }

        System.out.println(countD + " " + countC + " " + countB + " " + countA);
    }
}