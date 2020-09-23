import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int nextNum = scanner.nextInt();
        boolean ordered = true;

        sequence: while (scanner.hasNext()) {
            if (nextNum == 0) {
                break;
            } else if (nextNum == firstNum) {
                nextNum = scanner.nextInt();
                continue;
            } else if (nextNum > firstNum) {
                while (scanner.hasNext()) {
                    firstNum = nextNum;
                    nextNum = scanner.nextInt();

                    if (nextNum == 0) {
                        break sequence;
                    } else if (nextNum >= firstNum) {
                        continue;
                    } else {
                        ordered = false;
                        break sequence;
                    }
                }
            } else {
                while (scanner.hasNext()) {
                    firstNum = nextNum;
                    nextNum = scanner.nextInt();

                    if (nextNum == 0) {
                        break sequence;
                    } else if (nextNum <= firstNum) {
                        continue;
                    } else {
                        ordered = false;
                        break sequence;
                    }
                }
            }
        }

        System.out.println(ordered);
    }
}