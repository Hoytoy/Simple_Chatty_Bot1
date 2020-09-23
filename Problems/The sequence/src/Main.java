import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int biggestRemainder4 = 0;
        int count = scanner.nextInt();

        while (count != 0) {
            int nextNum = scanner.nextInt();
            count--;
            if (nextNum % 4 == 0 && nextNum > biggestRemainder4) {
                biggestRemainder4 = nextNum;
            }
        }

        System.out.println(biggestRemainder4);
    }
}