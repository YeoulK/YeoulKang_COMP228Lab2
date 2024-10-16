abstract class BankAccount {

   protected String accountNumber;
   protected double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract boolean withdraw(double amount);

    public double getBalance(){
        return balance;
    }

}
