package Week1;

import java.util.Scanner;

//Write a program to accept gender ("Male" or "Female") and age (1-120) from command
//line arguments and print the percentage of interest based on the given conditions.
//Interest == 8.2% Gender ==> Female Age ==>1 to 58 Interest == 7.6% Gender ==>
//Female Age ==>59 -120 Interest == 9.2% Gender ==> Male Age ==>1-60 Interest ==
//8.3% Gender ==> Male Age ==>61-120
public class Assignment6 {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter the age");
        int Age = scanner.nextInt();
        System.out.println("please enter your gender ");
        String gender = scanner.next();



        if (gender.equalsIgnoreCase("Female")) {
            if (Age >= 1 && Age <= 58) {
                System.out.println("The intrest is 8.2%");
            } else if (Age >= 59 && Age <= 120) {
                System.out.println("The intrest is 7.6%");
            } else {
                System.out.println("Invalid");
            }

        }else if (gender.equalsIgnoreCase("Male")) {
            if (Age >= 1 && Age <= 60) {
                System.out.println("The intrest is 9.2%");
            } else if (Age >= 61 && Age <= 120) {
                System.out.println("The intrest is 8.3%");
            }else {
                System.out.println("Invalid");
            }
            scanner.close();
        }

    }

}
