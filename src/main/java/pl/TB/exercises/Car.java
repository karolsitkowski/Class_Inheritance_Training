package pl.TB.exercises;

/**
 * Created by sit0 on 25.05.17.
 */
class Car extends Vehicle {

    protected String model;
    protected String transmission;

    public Car(boolean steeringWheel, boolean engine, boolean breaks, boolean wheels, int speed, String model, String transmission) {
        super(true, true, true, true, speed);
        this.model = model;
        this.transmission = transmission;

    }
}
