// 7. Create a Bank with a collection of accounts and methods to add and remove
//    accounts, and to deposit and withdraw money. Account stores customer details.

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void deposit(Account account, double amount) {
        if (accounts.contains(account)) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(Account account, double amount) {
        if (accounts.contains(account)) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println("Account: " + account.getAccountNumber()
                    + ", Customer: " + account.getCustomerName()
                    + ", Balance: $" + account.getBalance());
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("1001", "Samir Husen", 1000);
        Account account2 = new Account("1002", "Pratik Thapa", 500);
        bank.addAccount(account1);
        bank.addAccount(account2);

        System.out.println("Accounts in the bank:");
        bank.displayAccounts();

        bank.deposit(account1, 200);
        bank.withdraw(account2, 100);
        System.out.println("After depositing and withdrawing:");
        bank.displayAccounts();

        bank.removeAccount(account2);
        System.out.println("Remaining accounts:");
        bank.displayAccounts();
    }
}
