package pl.TB.Composition.exercises;

import pl.TB.Composition.training.Dimensions;

/**
 * Created by sit0 on 30.05.17.
 */
public class Carpet {

    Dimensions carpetDimension;
    Price carpetPrice;
    String carpetName;

    public Carpet(Dimensions carpetDimension, Price carpetPrice, String carpetName) {
        this.carpetDimension = carpetDimension;
        this.carpetPrice = carpetPrice;
        this.carpetName = carpetName;
    }
}
