package pl.TB.exercises;

/**
 * Created by sit0 on 25.05.17.
 */
class Vehicle {
    protected boolean steeringWheel;
    protected boolean engine;
    protected boolean breaks;
    protected boolean wheels;
    protected int speed;


    protected Vehicle(boolean steeringWheel, boolean engine, boolean breaks, boolean wheels, int speed) {
        this.steeringWheel = steeringWheel;
        this.engine = engine;
        this.breaks = breaks;
        this.wheels = wheels;
        this.speed = speed;
    }


    protected void steerLeft(){
        System.out.println("Skręcam w lewo");
    }

    protected void steerRight(){
        System.out.println("Skręcam w prawo");
    }


    protected void slowDown(int slowSpeed){
        System.out.println("Zwalniam o: " + slowSpeed);
        speed = speed - slowSpeed;
    }

    protected void speedUp(int addSpeed){
        System.out.println("Przyśpieszam o: " + addSpeed);
        speed = speed + addSpeed;
    }

    protected void checkSpeed(){
        System.out.println("Speed is: " + speed);
    }

    protected void stopEngine(){
        System.out.println("Engine stoped");
        engine = false;
    }

    protected void startEngine(){
        System.out.println("Engine started brumbrumbrumbrum");
        engine = true;
    }

    protected void checkEngine(){
        if (engine == true)
            System.out.println("Silnik pracuje");
        if (engine == false)
            System.out.println("Silnik nie pracuje");
    }




}
