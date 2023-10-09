package Eredità;

public class SavingsAccount extends BankAccount{
   public SavingsAccount(double rate) {
       interestRate=rate;
   }
public void addInterest(){double interest=(getBalance()*interestRate)/100; deposit(interest);}
    public void setInterestRate(double qt){interestRate+=qt;}



    //private
    private double interestRate=10;

}
