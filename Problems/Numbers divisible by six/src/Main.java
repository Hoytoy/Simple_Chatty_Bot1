import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int sum = 0;
        int curNum;

        for (int i = 0; i < count; i++) {
            curNum = scanner.nextInt();
            if (curNum % 6 == 0) {
                sum += curNum;
            }
        }

        System.out.println(sum);
    }
}