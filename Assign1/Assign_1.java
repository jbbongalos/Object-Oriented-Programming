import java.util.Scanner;

public class Assign_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter an adjective: ");
        String adjective_1 = scan.next();
        System.out.println();

        System.out.print("Enter the name of an outdoor game: ");
        String game = scan.next();
        System.out.println();

        System.out.print("Enter another adjective: ");
        String adjective_2 = scan.next();
        System.out.println();

        System.out.print("Enter the name of a friend: ");
        String friend = scan.next();
        System.out.println();

        System.out.print("Enter a verb ending in ing: ");
        String ing = scan.next();
        System.out.println();

        System.out.print("Enter one more adjective: ");
        String adjective_3 = scan.next();
        System.out.println();

        System.out.println("It was a " + adjective_1 + " summer day at the beach.");
        System.out.println("My friend and I were in the water playing " + game + ".");
        System.out.println("As a " + adjective_2 + " wave came closer, my friend " + friend + " yelled,");
        System.out.println("Look! There's a jellyfish " + ing + "!");
        System.out.println("As we got closer, we saw that the jellyfish was indeed " + ing + "!");
        System.out.println("" + friend + " ran out of the water and onto the sand.");
        System.out.println("" + friend + " was afraid of " + ing + " jellyfish.");
        System.out.println("The rest of us stayed in the water playing " + game + " because " + ing + " jellyfish are "
                + adjective_3 + ".");
        System.out.println();

        System.out.println("Done!");

        scan.close();
    }
}