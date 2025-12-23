import java.io.*;

public class ACT_3 {
    public static void main(String[] args) {
        try {
            BufferedReader buffered_reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println();
            System.out.print("Please enter 1st number: ");
            int num_1 = Integer.parseInt(buffered_reader.readLine());

            System.out.print("Please enter 2nd number: ");
            int num_2 = Integer.parseInt(buffered_reader.readLine());

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
            System.out.println("===== SUCCESSFUL =====");

        } catch (IOException | NumberFormatException e) {
            System.out.println("Invalid input. Please enter whole numbers only.");
        }
    }
}
