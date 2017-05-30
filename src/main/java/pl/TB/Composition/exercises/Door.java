package pl.TB.Composition.exercises;

import pl.TB.Composition.training.Dimensions;

/**
 * Created by sit0 on 30.05.17.
 */
public class Door {

    Dimensions doorDimension;
    Price doorPrice;
    String doorName;

    public Door(Dimensions doorDimension, Price doorPrice, String doorName) {
        this.doorDimension = doorDimension;
        this.doorPrice = doorPrice;
        this.doorName = doorName;
    }
}
