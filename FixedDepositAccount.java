package sg.edu.nus;

public class FixedDepositAccount extends BankAccount {

    // public means no need to go through getter/setter to get values. static - to set the value straightaway
    public static double interest = 3.0;
    public static double duration = 6.0;

    public FixedDepositAccount(String accountNo, double balance) {
        super(accountNo, balance);
    }
    
    @Override
    public void deposit(double amount) {
        System.out.println("No operation");
    }
 
    @Override
    public void withdraw(double amount) {
        System.out.println("No operation");
    }

    @Override
    public void showAccount() {
        System.out.println("Account No. " + this.getAccountNo());
        System.out.println("FullName: " + this.getFullName());
        System.out.println("Balance: " + this.getBalance() + (100+interest)/100*this.getBalance());
    }
    
 }
