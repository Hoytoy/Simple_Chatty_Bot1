import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int max = 0;

        while (scanner.hasNext()) {
            int nextNum = scanner.nextInt();
            if (max < nextNum) {
                max = nextNum;
            }
        }

        System.out.println(max);
    }
}