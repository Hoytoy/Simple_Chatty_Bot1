import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int parts = scanner.nextInt();
        int ship = 0;
        int fix = 0;
        int reject = 0;
        int temp;

        for (int i = 0; i < parts; i++) {
            temp = scanner.nextInt();
            if (temp == 0) {
                ship++;
            } else if (temp == 1) {
                fix++;
            } else if (temp == -1) {
                reject++;
            }
        }

        System.out.println(ship + " " + fix + " " + reject);
    }
}