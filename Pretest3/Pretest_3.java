import java.util.Scanner;

public class Pretest_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your grade: ");
        int grade = scanner.nextInt();

        if (grade >= 60 && grade <= 74) {
            System.out.println("Your Grade is Failed");
        } else if (grade >= 75 && grade <= 79) {
            System.out.println("Your Grade is Poor");
        } else if (grade >= 80 && grade <= 85) {
            System.out.println("Your Grade is Good");
        } else if (grade >= 86 && grade <= 89) {
            System.out.println("Your Grade is Very Good");
        } else if (grade >= 90 && grade <= 100) {
            System.out.println("Your Grade is Excellent");
        } else {
            System.out.println("Grade not in range");
        }

        scanner.close();
    }
}