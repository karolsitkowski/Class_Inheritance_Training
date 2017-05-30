package pl.TB.Composition.exercises;

import pl.TB.Composition.training.Dimensions;

/**
 * Created by sit0 on 30.05.17.
 */
public class Sofa {

    Dimensions sofaDimension;
    String sofaName;
    Price sofaPrice;

    public Sofa(Dimensions sofaDimension, String sofaName, Price sofaPrice) {
        this.sofaDimension = sofaDimension;
        this.sofaName = sofaName;
        this.sofaPrice = sofaPrice;
    }
}
