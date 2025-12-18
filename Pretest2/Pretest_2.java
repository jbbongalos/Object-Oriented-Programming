import java.util.Scanner;

public class Pretest_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the Main Number: ");
        int num = scanner.nextInt();

        System.out.print("Loop: ");
        int loop = scanner.nextInt();

        // Using for loop
        for (int i = 1; i <= loop; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        scanner.close();
    }
}