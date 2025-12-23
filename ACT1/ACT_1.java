import java.util.Scanner;

public class ACT_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2, temp;

        System.out.println();
        System.out.println("Before Swap");
        System.out.print("Input the value of num1: ");
        num1 = scan.nextInt();

        System.out.print("Input the value of num2: ");
        num2 = scan.nextInt();

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println();
        System.out.println("After Swap");
        System.out.println("The new value of num1 is " + num1);
        System.out.println("The new value of num2 is " + num2);

        System.out.println();
        System.out.println("===== DONE =====");

        scan.close();

    }
}