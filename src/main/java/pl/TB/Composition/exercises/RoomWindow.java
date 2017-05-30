package pl.TB.Composition.exercises;

import pl.TB.Composition.training.Dimensions;

/**
 * Created by sit0 on 30.05.17.
 */
public class RoomWindow {

    Dimensions windowDimension;
    int windowPrice;
    String windowName;

    public RoomWindow(Dimensions windowDimension, int windowPrice, String windowName) {
        this.windowDimension = windowDimension;
        this.windowPrice = windowPrice;
        this.windowName = windowName;
    }
}
