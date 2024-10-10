import java.util.*;

public class p {
    public static void main(String args[]) {
        int count = 0;
        int sum = 0;
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the no to be added in list:");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                sum = sum + num;
                count++;
                System.out.println("Do you want to continue?? yes(1),no(0)");
                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                } else {
                    System.out.println("Invalid input. Please enter 0 or 1.");
                    choice = 0; // Set choice to 0 to exit the loop
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                choice = 0; // Set choice to 0 to exit the loop
            }
        } while (choice == 1);

        sc.close();

        System.out.println("The no of inputs given were:" + count);
        System.out.println("The sum of inputs given are " + sum);
    }
}
