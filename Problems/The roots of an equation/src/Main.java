import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int root1 = -1;
        int root2 = -1;
        int root3 = -1;
        int x = 0;
        String output = "";

        for (; root1 == -1 && x <= 1000; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                root1 = x;
                output = root1 + "\n";
            }
        }

        for (; root2 == -1 && x <= 1000; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                root2 = x;
                output = output.concat(root2 + "\n");
            }
        }

        for (; root3 == -1 && x <= 1000; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                root3 = x;
                output = output.concat(root3 + "\n");
            }
        }

        System.out.println(output);
    }
}