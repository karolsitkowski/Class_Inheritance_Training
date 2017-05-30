package pl.TB.Composition.exercises;

import pl.TB.Composition.training.Dimensions;

/**
 * Created by sit0 on 26.05.17.
 */
public class Main {
    public static void main(String[] args) {

        Clock roomClock = new Clock("Timex",new Time(10,21,33), new Price(100,"zł"));

        roomClock.printTime();
        roomClock.clockPrice.print();
        System.out.println(roomClock.clockPrice.price());

        




    }
}
