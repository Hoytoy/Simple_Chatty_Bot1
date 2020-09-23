import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // put your code here
        int durationInDays = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int hotelCostPerNight = scanner.nextInt();

        System.out.println(durationInDays * foodCostPerDay + 2 * oneWayFlightCost
                + --durationInDays * hotelCostPerNight);
    }
}