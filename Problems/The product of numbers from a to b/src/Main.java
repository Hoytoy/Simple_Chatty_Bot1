import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long firstFac = scanner.nextInt();
        long lastFacExcl = scanner.nextInt();

        long product = 1;

        for (long i = firstFac; i < lastFacExcl; i++) {
            product *= i;
            //System.out.println(product);
        }

        System.out.println(product);
    }
}