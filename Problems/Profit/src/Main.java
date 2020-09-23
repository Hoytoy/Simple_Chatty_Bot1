import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        double curMoney = scanner.nextInt();
        double interest = scanner.nextInt();
        double finalK = scanner.nextInt();
        int years = 0;

        while (curMoney < finalK) {
            curMoney += curMoney * interest / 100;
            // curMoney *= 1 + interest /100;
            years++;
        }

        System.out.println(years);
    }
}