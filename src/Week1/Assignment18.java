package Week1;
import java.util.Scanner;

/*Write a Java program to find if the given number is palindrome or not.*/

public class Assignment18 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (isPalindrome(number)) {
                System.out.println("The number is a palindrome.");
            } else {
                System.out.println("The number is not a palindrome.");
            }
        }

        public static boolean isPalindrome(int number) {
            int originalNumber = number;
            int reversedNumber = 0;

            while (number != 0) {
                int remainder = number % 10;
                reversedNumber = (reversedNumber * 10) + remainder;
                number = number / 10;
            }

            return originalNumber == reversedNumber;
        }
    }


