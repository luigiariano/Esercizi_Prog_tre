package Tipi_di_dati;

public class Purse {
    //public
    public void addNickels(int qt){ nickels+=qt;}
    public void addDimes(int qt){ dimes+=qt;}
    public void addQuarter(int qt){ quarters+=qt;}
    public static float Nickels=0.05f;
    public static float Dimes=0.1f;
    public static float Quarters=0.25f;
    public float getTotal(){return (nickels*Nickels)+(dimes * Dimes)+ (quarters * Quarters);}




    //private
    private int nickels;
    private int dimes;
    private int  quarters;
}
