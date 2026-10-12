package exercise9;

public class Main {
    public static void main(String[] args){
        BankAccount savings = new SavingsAccount(1000);
        BankAccount checking = new CheckingAccount(1500);

        savings.deposit(200);
        savings.withdraw(200);
        System.out.println("Savings balance (no fee): " + savings.getBalance());
        savings.withdraw(600);
        System.out.println("Savings balance after rejected withdrawal: " + savings.getBalance());

        checking.deposit(200);
        checking.withdraw(200);
        System.out.println("Checking balance (fee of 5): " + checking.getBalance());
        checking.withdraw(1100);
        System.out.println("Checking balance after rejected withdrawal: " + checking.getBalance());
    }
}
