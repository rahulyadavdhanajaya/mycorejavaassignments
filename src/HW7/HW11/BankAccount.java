package HW7.HW11;
//Create a class called BankAccount that has private variables accountNumber, balance, and customerName.
//        Create public methods to access and modify these variables,
//        such as getAccountNumber(), getBalance(), getCustomerName(), setAccountNumber(), setBalance(), and setCustomerName().
public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
