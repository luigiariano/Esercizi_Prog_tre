package Eredità;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(double soldi){super.deposit(soldi);}
    public boolean deductFess(){if(transactionCount<=FREE_TRANSACTIONS){ transactionCount++; return true;}else{return false;}}
    public void deposit(double quan)
    {
         if(deductFess()){super.deposit(quan);}else {fess();transactionCount=0;super.withdraw(fees); }
    }
public void withdraw(double qt)
{
    if(deductFess()){super.withdraw(qt);}else {fess();transactionCount=0;super.withdraw(fees); }
}
  private static final int FREE_TRANSACTIONS=3;
    private static final double TRANSACTION_FEE=2.0f;
    private void fess(){fees=TRANSACTION_FEE *
            (transactionCount - FREE_TRANSACTIONS);}
    private double fees;
    private static int transactionCount=1;
}
