import java.util.Scanner;

public class Assign_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Input the size of Array1: ");
        int size = scanner.nextInt();

        int[] array1 = new int[size];

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Input a number: ");
            array1[i] = scanner.nextInt();
        }

        int[] array2 = new int[size + 1];

        for (int i = 0; i < size; i++) {
            array2[i] = array1[i];
        }

        System.out.print("\nInsert a new number: ");
        int newNumber = scanner.nextInt();
        array2[size] = newNumber;

        System.out.println();
        System.out.print("The elements of Array2:  ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < array2.length - 1; i++) {
            for (int j = 0; j < array2.length - 1 - i; j++) {
                if (array2[j] > array2[j + 1]) {
                    int temp = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = temp;
                }
            }
        }
 
        System.out.print("Sorted Elements       :  ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println();
        System.out.println("----- DONE -----");
        
        scanner.close();
    }
}