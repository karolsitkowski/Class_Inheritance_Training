package pl.TB.exercises;

/**
 * Created by sit0 on 25.05.17.
 */
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(true,false,true,true,0);
        vehicle.run();
        System.out.println("--------------------------");

        Car myCar = new Car("BMW","automatyczna");
        myCar.run();
        System.out.println("--------------------------");

        Cabriolet myCabriolet = new Cabriolet("Corvette","Manualna",9,false);
        myCabriolet.run();
        System.out.println("--------------------------");

        System.out.println("A teraz testuje samochody przez inny konstruktor:");

        Cabriolet testCabriolet = new Cabriolet(true,true,true,true,7,"Test Cabrio","Automatic",2,true);
        testCabriolet.run();
        System.out.println("--------------------------");


        Car brokenCar = new Car(false,true,false,false,0,"Fiat","Manualna");
        brokenCar.run();


    }


}
