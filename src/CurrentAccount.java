 class CurrentAccount  extends BankAccount {
     public CurrentAccount(String accountNumber, double balance) {
         super(accountNumber, balance);
     }

     @Override
     public boolean withdraw(double amount) {
         if (amount <= balance) {
             balance -= amount;
             return true;
         }
         return false;

     }


 }
