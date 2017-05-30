package pl.TB.Encapsulation.exercises;

/**
 * Created by sit0 on 30.05.17.
 */
public class Main {

    public static void main(String[] args) {

        Printer myNewPrinter = new Printer(false,10, 100,false);
        myNewPrinter.checkToner();
        myNewPrinter.checkPrintedPages();
        myNewPrinter.printPage();
        myNewPrinter.printPage();
        myNewPrinter.printPage();
        myNewPrinter.printPage();
        myNewPrinter.printPage();
        myNewPrinter.printPage();
        myNewPrinter.checkToner();
        myNewPrinter.checkPrintedPages();
        myNewPrinter.fillToner(3);
        myNewPrinter.checkToner();


        System.out.println("------------DRUGA---DRUKARKA---------------");

        Printer myOldPrinter = new Printer(true,10,100,false);
        myOldPrinter.checkToner();
        myOldPrinter.checkPrintedPages();
        myOldPrinter.printPage();
        myOldPrinter.printPage();
        myOldPrinter.printPage();
        myOldPrinter.printPage();
        myOldPrinter.checkToner();
        myOldPrinter.checkPrintedPages();
        myOldPrinter.fillToner(33);
        myOldPrinter.checkToner();
    }
}
