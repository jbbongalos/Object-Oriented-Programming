import java.util.Scanner;

public class ACT_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 50000; 

        while (true) { 
            System.out.println();
            System.out.println("WELCOME TO CSPC ATM MACHINE! I HAVE A BALANCE OF " + balance + " PESOS!");

            if (balance == 0) {
                System.out.println("YOUR BALANCE IS 0. THANK YOU FOR USING CSPC ATM MACHINE!");
                System.out.println("--- Successfully Run ---");
                System.out.println();
                break; 
            }
            
            System.out.println();
            System.out.print("Input the amount: ");
            int withdraw = scanner.nextInt();

            if (withdraw > 0 && withdraw <= balance) {
                balance = balance - withdraw; 
                System.out.println("THANK YOU FOR WITHDRAWING " + withdraw + " PESOS!");
            } else {
                System.out.println("INSUFFICIENT BALANCE! PLEASE INPUT A VALID AMOUNT");
            }
        }
    }
}