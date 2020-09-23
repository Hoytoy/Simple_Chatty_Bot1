import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int heightN = scanner.nextInt();
        int numBridges = scanner.nextInt();

        for (int i = 0; i <= numBridges; i++) {
            if (i == numBridges) {
                System.out.println("Will not crash");
            } else if (heightN < scanner.nextInt()) {
                continue;
            } else {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            }
        }
    }
}
