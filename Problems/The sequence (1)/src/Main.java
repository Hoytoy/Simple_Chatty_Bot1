import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int curNum = 1;

        while (n > 0) {
            for (int i = 0; i < curNum; i++) {
                System.out.print(curNum + " ");
                n--;
                if (n == 0) {
                    break;
                }
            }
            curNum++;
        }
    }
}