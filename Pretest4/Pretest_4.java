import java.util.Scanner;

public class Pretest_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input NumStart: ");
        int start = scanner.nextInt();

        System.out.print("Input NumEnd: ");
        int end = scanner.nextInt();

        int sum = 0;

        System.out.print("It will add: ");
        for (int i = start; i <= end; i++) {
            sum += i;
            System.out.print(i + (i < end ? " + " : ""));
        }

        System.out.println(" = " + sum);
        System.out.println("Output = The sum is " + sum);

        scanner.close();
    }
}