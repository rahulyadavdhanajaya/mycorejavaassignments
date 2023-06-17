package Week1;

import java.util.Scanner;

//Write a Java program to find if the given number is prime or not.



public class Assignment14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the number");
        int num=scanner.nextInt();
        int count = 0;

        if (num > 1) {
            for (int i = 1; i < num; i++) {
                if (num % i == 0)
                    count++;
                }
                if (count == 2) {
                    System.out.println(num + "is prime");
                } else {
                    System.out.println(num + "is not prime");
                }
            }
        }
    }
