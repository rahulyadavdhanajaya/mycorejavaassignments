package Week1;

//Write a program that displays a menu with options 1. Add 2. Sub Based on the options
//        chosen, read 2 numbers and perform the relevant operation. After performing the
//        operation, the program should ask the user if he wants to continue. If the user presses y
//        or Y, then the program should continue displaying the menu else the program should
//        terminate. [ Note: Use Scanner class, you can take help from the trainer regarding the
//        same ]
import java.util.Scanner;

public class Assignment20 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.print("Enter your choice: ");
            //using the switch case we are giving the numbers
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = scanner.nextInt();
                    int sum = num1 + num2;
                    System.out.println("Sum: " + sum);
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    int num3 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num4 = scanner.nextInt();
                    int difference = num3 - num4;
                    System.out.println("Difference: " + difference);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.print("Do you want to continue? (y/n): ");
            String input = scanner.next();
            if (!input.equalsIgnoreCase("y")) {
                shouldContinue = false;
            }
        }

        System.out.println("Program terminated.");

    }
}
