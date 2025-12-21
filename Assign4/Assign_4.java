import java.util.Scanner;

public class Assign_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Input num1: ");
        int num_1 = scanner.nextInt();
        System.out.print("Input num2: ");
        int num_2 = scanner.nextInt();
        System.out.print("Input num3: ");
        int num_3 = scanner.nextInt();
        System.out.print("Input num4: ");
        int num_4 = scanner.nextInt();

        if (num_1 == num_2 && num_2 == num_3 && num_3 == num_4) {
            System.out.println("Two Pairs");
        }
        else if ((num_1 == num_2 && num_3 == num_4 && num_1 != num_3) ||
                 (num_1 == num_3 && num_2 == num_4 && num_1 != num_2) ||
                 (num_1 == num_4 && num_2 == num_3 && num_1 != num_2)) {
            System.out.println("Two Pairs");
        }
        else {
            System.out.println("Not Two Pairs");
        }

        System.out.println();
        System.out.println("--- DONE ---");
        System.out.println();

        scanner.close();
    }
}