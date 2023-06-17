package Week1;

import java.util.Scanner;

//Write a program to print prime numbers between 10 and 99.
public class Assignment13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the Firstnumber");
        int Firstnumber = scanner.nextInt();
        System.out.println("Please enter the Secondnumber");
        int Secondnumber = scanner.nextInt();

        for (int number =Firstnumber; number <= Secondnumber; number++) {
            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(number + "is a prime ");
            } else {
                System.out.println(number + "is not a prime");


            }
        }
    }
}
