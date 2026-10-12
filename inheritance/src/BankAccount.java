// 5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
//    Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
public class BankAccount {
    protected double accountBalance;

    public double deposit(double amount){
        accountBalance += amount;
        return accountBalance;
    }

    public double withdraw(double amount){
        accountBalance -= amount;
        return accountBalance;
    }
}
