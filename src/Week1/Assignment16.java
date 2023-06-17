package Week1;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter the number ");
//        int row = scanner.nextInt();
int number=5;
        for (int i = 0; i < number; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}