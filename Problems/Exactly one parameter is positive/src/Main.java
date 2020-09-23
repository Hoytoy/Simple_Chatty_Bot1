import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // put your code here
        boolean num1 = scanner.nextInt() > 0;
        boolean num2 = scanner.nextInt() > 0;
        boolean num3 = scanner.nextInt() > 0;

        /*  short and understandable imho:
            boolean result = !(num1 && num2) && !(num1 && num3) && !(num2 && num3) && (num1 || num2 || num3);
         */

        boolean and12 = num1 && num2;
        boolean and13 = num1 && num3;
        boolean and23 = num2 && num3;
        boolean or123 = num1 || num2 || num3;

        boolean result = !and12 && !and13 && !and23 && or123;

        System.out.println(result);
    }
}