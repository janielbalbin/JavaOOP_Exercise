package bank;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) { accounts.add(account); }
    public void removeAccount(Account account) { accounts.remove(account); }
}
