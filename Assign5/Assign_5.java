import java.util.Scanner;

public class Assign_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        System.out.println();
        System.out.print("Reversed order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println();
        System.out.println("--- DONE ---");

        scanner.close();
    }
}