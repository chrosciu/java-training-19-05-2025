package eu.chrost.day5.unittests;

class BankAccount {
    private final String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String accountNumber) {
        this(accountNumber ,0);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber='" + accountNumber + '\'' + ", balance=" + balance + '}';
    }
}
