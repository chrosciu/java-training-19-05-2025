package eu.chrost.day5.junit.lectures;

class BankAccount {

    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String accountNumber) {
        this(accountNumber, 0.0);
    }

    public BankAccount() {
        this("0000", 0.0);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber='" + accountNumber + '\'' + ", balance=" + balance + '}';
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

