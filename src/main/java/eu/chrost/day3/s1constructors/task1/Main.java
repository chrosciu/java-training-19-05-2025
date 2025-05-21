package eu.chrost.day3.s1constructors.task1;

class Main {
    public static void main(String[] args) {
        BankAccount konto1 = new BankAccount();
        BankAccount konto2 = new BankAccount("12345");
        BankAccount konto3 = new BankAccount("5678", 500);
        System.out.println("Konta:");
        System.out.println(konto1);
        System.out.println(konto2);
        System.out.println(konto3);
        konto1.deposit(500);
        System.out.println(konto1);
        konto2.withdraw(1000);
        System.out.println(konto2);
        konto3.withdraw(200);
        System.out.println(konto3);
        System.out.println(konto1.getBalance());
        System.out.println(konto2.getAccountNumber());
    }
}
