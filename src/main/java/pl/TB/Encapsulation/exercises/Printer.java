package pl.TB.Encapsulation.exercises;

/**
 * Created by sit0 on 30.05.17.
 */
public class Printer {
    private int tonerLevel = 100;
    private int pagesPrintedCounter = 0;
    private boolean ifDuplexPrinter = true;
    private boolean ifUsed;

    public void fillToner(int toner){
        tonerLevel += toner;
        System.out.println(toner + " of toner was injected and now toner level is: " + tonerLevel);
    }

    public void checkToner(){
        System.out.println("Toner level is: " + tonerLevel);
    }

    public void checkPrintedPages(){
        System.out.println("Printed pages: " + pagesPrintedCounter);
    }

    public Printer(boolean ifUsed, int tonerLevel, int pagesPrintedCounter, boolean ifDuplexPrinter) {

        if(ifUsed){
            System.out.println("Drukarka jest używana");
            this.ifDuplexPrinter = ifDuplexPrinter;
            this.pagesPrintedCounter = pagesPrintedCounter;
            if(tonerLevel <= 100 && tonerLevel >= 0){
                this.tonerLevel = tonerLevel;
            }
        }else {
            System.out.println("Drukarka jest nowa");
        }


    }

    public void printPage(){
        System.out.println("Printing page ...........");
        if (ifDuplexPrinter){
            pagesPrintedCounter += 2;
            tonerLevel -= 2;
        }
        else{
            pagesPrintedCounter++;
            tonerLevel --;
        }

    }

}
