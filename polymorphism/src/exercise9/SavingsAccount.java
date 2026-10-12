package exercise9;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance){
        super(balance);
    }

    @Override
    public void withdraw(double amount){
        // Example policy: maximum 500 per withdrawal, no fee.
        if (amount > 500) {
            System.out.println("Savings withdrawal limit is 500.");
        } else {
            super.withdraw(amount);
        }
    }
}
