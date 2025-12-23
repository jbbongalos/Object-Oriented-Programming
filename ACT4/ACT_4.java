import java.util.Scanner;

public class ACT_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Available Denominations:");
        System.out.println("1000 pesos bill");
        System.out.println("500 pesos bill");
        System.out.println("200 pesos bill");
        System.out.println("100 pesos bill");
        System.out.println("50 pesos bill");
        System.out.println("20 pesos bill");
        System.out.println("10 pesos bill");
        System.out.println("5 pesos bill");
        System.out.println("1 peso bill");

        System.out.println();
        System.out.print("Input the Amount: ");
        int amount = scanner.nextInt();

        if (amount > 9999) { 
            System.out.println("Amount exceeds the maximum limit of 9999 pesos.");
        } else {
            int thousand, fiveHundred, twoHundred, oneHundred;
            int fifty, twenty, ten, five, one;

            thousand = amount / 1000;
            amount = amount % 1000;

            fiveHundred = amount / 500;
            amount = amount % 500;

            twoHundred = amount / 200;
            amount = amount % 200;

            oneHundred = amount / 100;
            amount = amount % 100;

            fifty = amount / 50;
            amount = amount % 50;

            twenty = amount / 20;
            amount = amount % 20;

            ten = amount / 10;
            amount = amount % 10;

            five = amount / 5;
            amount = amount % 5;

            one = amount; 

            System.out.println();
            System.out.println("Output:");
            System.out.println("1000 pesos bill = " + thousand);
            System.out.println("500 pesos bill = " + fiveHundred);
            System.out.println("200 pesos bill = " + twoHundred);
            System.out.println("100 pesos bill = " + oneHundred);
            System.out.println("50 pesos bill = " + fifty);
            System.out.println("20 pesos bill = " + twenty);
            System.out.println("10 pesos bill = " + ten);
            System.out.println("5 pesos bill = " + five);
            System.out.println("1 peso bill = " + one);
        }

        System.out.println();
        System.out.print("--- Successfully Run ---");
        System.out.println();

        scanner.close();
    }
}