package Eredità;

public class BankAccount {
    //public:
    //metodi
    public BankAccount(){ this(0); lastassignment++; newBalance=lastassignment;}

    public BankAccount(double saldo)
    {
        this.saldo=saldo;
        lastassignment++;
        newBalance=lastassignment;
    }
    public void deposit(double qt)//qt sta per quantita da versare
    {
        saldo=saldo+qt;
    }
    public void  withdraw(double qt)//qt sta per quantita da prelevare
    {
        saldo=saldo-qt;
    }
    public double  getBalance()//fa vedere il saldo
    {
        return saldo;
    }
    //private:
    private double saldo=0;
    private static int lastassignment; //è una variabile globale il cui valore non dipende dal oggetto nello specifico
    public int newBalance;
}
