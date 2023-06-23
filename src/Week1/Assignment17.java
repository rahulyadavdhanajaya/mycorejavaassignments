package Week1;
//Write a program to reverse a given number and print Eg1) I/P: 1234 O/P:4321 Eg2)
//I/P:1004 O/P:4001


import java.util.Scanner;
public class Assignment17 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int number = input.nextInt();

                int reversedNumber = reverseNumber(number);
                System.out.println("Reversed number: " + reversedNumber);
            }

             static int reverseNumber(int number) {
                int reversedNumber = 0;
                while (number != 0) {
                    int remainder = number % 10;
                    reversedNumber = (reversedNumber * 10) + remainder;
                    number = number / 10;
                }
                return reversedNumber;
            }
        }


