package object_oriented.java_constructor.constructor_with_validation;

public class Account {

    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.err.println("Account Number should be non-null and non-empty");
            return;
        }
        if (balance < 0) {
            System.err.println("Balance should be non-negative");
            return;
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        Account account1 = new Account("G-123456", 1200);
        System.out.println(account1.toString());

        Account account2 = new Account("", 1200);
        System.out.println(account2.toString());

        Account account3 = new Account("G-432657", -4);
        System.out.println(account3.toString());
    }
}
