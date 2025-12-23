import java.util.Scanner;

public class ACT_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num_1, num_2;

        System.out.println();
        System.out.print("Please enter 1st number: ");
        num_1 = scan.nextInt();

        System.out.print("Please enter 2nd number: ");
        num_2 = scan.nextInt();

        int sum = num_1 + num_2;
        int difference = num_1 - num_2;
        int product = num_1 * num_2;

        System.out.println();
        System.out.println("The Sum is: " + sum);
        System.out.println("The Difference is: " + difference);
        System.out.println("The Product is: " + product);

        if (num_2 != 0) {
            int quotient = num_1 / num_2;
            int remainder = num_1 % num_2;
            System.out.println("The Quotient is: " + quotient);
            System.out.println("The Remainder is: " + remainder);
        } else {
            System.out.println("The Quotient is: Undefined (cannot divide by zero)");
            System.out.println("The Remainder is: Undefined (cannot divide by zero)");
        }

        System.out.println();
        System.out.println("----- DONE -----");

        scan.close();

    }
}