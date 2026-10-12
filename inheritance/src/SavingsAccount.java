// 5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
//    Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
public class SavingsAccount extends BankAccount{
    @Override
    public double withdraw(double amount){
        if (accountBalance - amount < 100) {
            System.out.println("Cannot withdraw: balance must remain at least 100.");
        } else {
            accountBalance -= amount;
        }
        return accountBalance;
    }

    public static void main(String[] args){
        SavingsAccount savingsAccount = new SavingsAccount();
        System.out.println("After deposit: " + savingsAccount.deposit(1500));
        System.out.println("After withdrawal: " + savingsAccount.withdraw(400));
        System.out.println("After attempted withdrawal: " + savingsAccount.withdraw(1));
    }
}
