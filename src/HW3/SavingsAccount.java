package HW3;

import HW3.BankAccount;

//Create a class called BankAccount with two instance variables, balance and interestRate. //
// Then create a subclass called SavingsAccount that inherits from BankAccount.
// The SavingsAccount class should have an additional instance variable, minimumBalance,
// and an implementation of a method withdraw() that checks if the withdrawal amount would bring the balance below the minimum and,
// if so, does not allow the withdrawal.//
public class SavingsAccount extends BankAccount {
    int minimumBalance=500;
    int balance=7000;
    int withdrawalAmount;

    public void withdraw(int withdrawalAmount) {
        if (balance - withdrawalAmount > minimumBalance) {
            balance = balance - withdrawalAmount;
        } else {
            System.out.println("not possible to withdraw");
        }

    }
}