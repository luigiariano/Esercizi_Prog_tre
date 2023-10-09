package Tipi_di_dati;

import Tipi_di_dati.Purse;

public class PurseTest
{
    public static void main(String[] args)
    {
       Purse mypurse=new Purse();
       mypurse.addNickels(5);
       mypurse.addDimes(5);
       mypurse.addQuarter(5);
       float totalvalue=mypurse.getTotal();
       System.out.println("Total is "+totalvalue);
    }
}
