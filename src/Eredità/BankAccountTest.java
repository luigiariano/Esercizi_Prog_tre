package Eredità;
    public class BankAccountTest {
        public static void main(String[] args) {
//Creiamo un oggetto di tipo BankAccount
            BankAccount Luigi=new BankAccount(100);
            //versiamo i soldi
            Luigi.deposit(50);
            //Facciamo un prelievo
            Luigi.withdraw(5);
            //Stampiamo
            System.out.println(Luigi.getBalance());
            //vediamo il numero di conti aperti
            System.out.println(Luigi.newBalance);
            BankAccount Ciao=new BankAccount(100);
            System.out.println(Ciao.newBalance);
        }
    }
