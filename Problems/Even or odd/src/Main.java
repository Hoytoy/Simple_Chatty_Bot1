import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int temp = scanner.nextInt();

            if (temp == 0) {
                break;
            }
            System.out.println(temp % 2 == 0 ? "even" : "odd");
        }
    }
}