import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int lengthN = scanner.nextInt();
        int widthM = scanner.nextInt();
        int segmentsK = scanner.nextInt();

        if (segmentsK % lengthN == 0 && segmentsK / lengthN < widthM) {
            System.out.println("YES");
        } else if (segmentsK % widthM == 0 && segmentsK / widthM < lengthN) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}