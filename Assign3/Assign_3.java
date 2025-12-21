import java.util.Scanner;

public class Assign_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Input num1: ");
        int num_1 = scanner.nextInt();

        System.out.print("Input num2: ");
        int num_2 = scanner.nextInt();

        System.out.print("Input num3: ");
        int num_3 = scanner.nextInt();

        if (num_1 <= num_2 && num_2 <= num_3) {
            System.out.println("Numbers in order");
        }

        else if (num_1 >= num_2 && num_2 >= num_3) {
            System.out.println("Numbers in order");
        }

        else {
            System.out.println("Numbers not in order");
        }

        System.out.println();
        System.out.println("--- DONE ---");
        System.out.println();

        scanner.close();
    }
}