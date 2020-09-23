//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        /* String age = */scanner.nextLine();
        /* String educationStage = */ scanner.nextLine();
        /* String experienceYears = */ scanner.nextLine();
        String cuisinePreference = scanner.nextLine();

        System.out.printf("The form for %s is completed. ", name);
        System.out.printf("We will contact you if we need a chef that cooks %s dishes.", cuisinePreference);
    }
}