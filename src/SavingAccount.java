 class SavingAccount extends BankAccount {

    private static final double MAX_WITHDRAWAL = 1000;

    public SavingAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }
    @Override
     public boolean withdraw(double amount) {
        if (amount <= MAX_WITHDRAWAL && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
