package HW7.HW11;

public class Main {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.setAccountNumber(123456789);
        ba.setCustomerName("rahul");
        ba.setBalance(5000.00);
        System.out.println(ba.getAccountNumber());
        System.out.println(ba.getBalance());
        System.out.println(ba.getCustomerName());
    }
}
