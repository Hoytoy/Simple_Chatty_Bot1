import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        String line1NoWs = line1.trim().replace(" ", "");
        String line2NoWs = line2.trim().replace(" ", "");

        System.out.println(line1NoWs.equals(line2NoWs));
    }
}