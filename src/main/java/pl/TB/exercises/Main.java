package pl.TB.exercises;

/**
 * Created by sit0 on 25.05.17.
 */
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(true,false,true,true,0);
        vehicle.checkEngine();
        vehicle.checkSpeed();
        vehicle.startEngine();
        vehicle.speedUp(4);
        vehicle.checkSpeed();
        vehicle.speedUp(7);
        vehicle.checkSpeed();
        vehicle.slowDown(11);
        vehicle.checkSpeed();
        vehicle.stopEngine();
        vehicle.checkEngine();



    }
}
