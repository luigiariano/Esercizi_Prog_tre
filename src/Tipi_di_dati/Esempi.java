package Tipi_di_dati;

import Eredità.CheckingAccount;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Esempi {
    public static void main(String[] args) {
        //Tipi_di_dati.Esempi di come possono essere create le stringhe
        String nome = "Mario rossi";
        String cognome = new String("Mario Rossi");
        //la classe delle stringhe mette a disposizione dei metodi che ci permettono di
        //fare moltissime operazioni con le stringhe
        nome = nome.toUpperCase();//Restituisce la stringa scritta con caratteri in maiuscolo
        System.out.println(nome);
        //compareTo si utilizza per il confronto tra stringhe
        int h;//compare to restituisce un intero
        h = nome.compareTo(cognome);
        System.out.println(h); //restituisce -32 e quindi string1 è < di string 2
        //Per convertire una stringa
        String numero_telefono = "37602879";
        int numero_telefono_intero = Integer.parseInt(numero_telefono); //trasforma la stringa in intero
        float numero_telefono_float = Float.parseFloat(numero_telefono); //trasforma la stringa in un float
        //Operazioni su sottostringhe
        nome = nome.substring(0, 3); //Parte dall'indice 0 e si prende tre numeri
        System.out.println(nome);
        //Prendo input da tastiera primo modo
        String input = JOptionPane.showInputDialog("Inserisci i soldi");
        int intero = Integer.parseInt(input);
        System.out.println(intero);
        //check account test
        CheckingAccount luigi=new CheckingAccount(3);
        luigi.deposit(5); //18-3
        luigi.deposit(5);
        luigi.deposit(5);
        luigi.deposit(5);
        System.out.println(luigi.getBalance());



    }
}
