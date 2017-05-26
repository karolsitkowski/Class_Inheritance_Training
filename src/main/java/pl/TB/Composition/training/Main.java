package pl.TB.Composition.training;

/**
 * Created by sit0 on 26.05.17.
 */
public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(30,45,10);
        Case myCase = new Case("Trinity","Dell", "230",dimensions);

        Monitor myMonitor = new Monitor("AB40","NOC",21,new Resolution(1920,1080));

        Motherboard myMotherboard = new Motherboard("BJ-50", "Asus",4,8,"v2.44");

        PC myPC = new PC(myCase,myMonitor,myMotherboard);

        myPC.powerUp();



//        myPC.getMyMonitor().drawPixelAt(1500,600,"red");
//        myPC.getMyCase().pressPowerButton();
//        myPC.getMyMotherbord().loadProgram("Windows1.0");

    }
}
