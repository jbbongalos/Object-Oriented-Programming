import java.util.Scanner;

public class Pretest_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Input a number: ");
            num = scanner.nextInt();

            if (num % 2 != 0) {
                System.out.println("Number Rejected. It is an Odd Number\n");
            } else if (num < 20) {
                System.out.println("Number Rejected. It is an Even number but less than 20\n");
            } else {
                System.out.println("Number Accepted.");
                break; // exit loop once valid input is given
            }
        }

        scanner.close();
    }
}