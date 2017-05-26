package pl.TB.Inheritance.exercises;

/**
 * Created by sit0 on 25.05.17.
 */
class Car extends Vehicle {

    protected String model;
    protected String transmission;

    public Car(String model, String transmission) {
        super(true, true, true, true,0,0);
        this.model = model;
        this.transmission = transmission;

    }

    public Car(boolean steeringWheel, boolean engine, boolean breaks, boolean wheels, int speed, int gear, String model, String transmission) {
        super(steeringWheel, engine, breaks, wheels, speed, gear);
        this.model = model;
        this.transmission = transmission;
        System.out.println("Car z innym konstruktorem");
    }

    @Override
    protected void run() {
        System.out.println("!Overrided Run z klasy Car");
        System.out.println("Jestem " + model);
        System.out.println("Moja skrzynia biegów jest " + transmission);
        super.run();
    }
}
