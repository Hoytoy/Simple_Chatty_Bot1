import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int minA = scanner.nextInt();
        int maxB = scanner.nextInt();
        int actH = scanner.nextInt();

        if (actH < minA) {
            System.out.println("Deficiency");
        } else if (actH > maxB) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}