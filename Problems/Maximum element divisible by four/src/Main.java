import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int max4 = 0;
        int n = scanner.nextInt();
        int temp;

        for (int i = 0; i < n; i++) {
            temp = scanner.nextInt();

            if (temp % 4 == 0 && temp >= max4) {
                max4 = temp;
            }
        }

        System.out.println(max4);
    }
}