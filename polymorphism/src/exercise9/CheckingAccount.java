package exercise9;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance){
        super(balance);
    }

    @Override
    public void withdraw(double amount){
        // Example policy: maximum 1000 per withdrawal, plus a fee of 5.
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > 1000) {
            System.out.println("Checking withdrawal limit is 1000.");
        } else {
            super.withdraw(amount + 5);
        }
    }
}
