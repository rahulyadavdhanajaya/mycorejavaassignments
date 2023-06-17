package Week1;

import java.util.Scanner;

//Write a program to check if a given number is prime or not.


public class Assignment12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the number");
        int num=scanner.nextInt();

        boolean isPrime= true;
        if (num<=1){
            isPrime=false;
        }
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

    if (isPrime){
        System.out.println(num +"is a prime ");
                }else{
        System.out.println(num + "is not a prime");

            }
    }
}