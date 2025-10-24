package bank;

public class BankMain {
    public static void main(String[] args) {
        Bank b = new Bank();
        Account a1 = new Account("John", 1000);
        b.addAccount(a1);
        System.out.println("Account added for " + a1.name);
    }
}
