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
        if (engine)
            System.out.println("Silnik już pracuje");
        if (!engine){
            System.out.println("Silnik nie pracuje");
        }

    }

    protected void run(){
        System.out.println("!Run from Vehicle");
        if (!wheels) {
                System.out.println("Twój samochód nie ma kół, nie pojedzie!");
                System.exit(0);
            }
        if (!steeringWheel) {
                System.out.println("Twój samochód nie ma kierownicy, nie pojedzie!");
                System.exit(0);
        }
        checkEngine();
        if (!engine)
            startEngine();
        checkSpeed();

        if(speed != 0){
            System.out.println("Ustawiam speed na 0");
            speed = 0;
            checkSpeed();
        }

        speedUp(4);
        checkSpeed();
        speedUp(7);
        checkSpeed();
        slowDown(11);
        checkSpeed();

        if (engine)
            stopEngine();

        checkEngine();
    }




}
