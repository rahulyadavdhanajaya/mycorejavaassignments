package Week1;
//Write a program to add all the values in a given number and print. Ex: 1234->10
public class Assignment15 {
    public static void main(String[] args) {
        int num=1654;
        int sum;
        for (sum=0;num!=0;num/=10)   //num/ means leaving the last digit.
        { sum += num % 10;}
            {
            System.out.println(sum);
        }
    }
}
