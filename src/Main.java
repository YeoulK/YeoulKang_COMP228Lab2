public class Main {
    public static void main(String[] args) {

        SavingAccount savingAccount = new SavingAccount("12",1000);
        CurrentAccount currentAccount = new CurrentAccount("14",1000);

        if(savingAccount.withdraw(700)){
            System.out.println("Withdrawal successful. Remaining balance: " + savingAccount.getBalance());
        }
        if(currentAccount.withdraw(500)){
            System.out.println("Withdrawal successful. Reamaining balance:" + currentAccount.getBalance());
        }




    }
}
