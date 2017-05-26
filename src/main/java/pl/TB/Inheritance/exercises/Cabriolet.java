package pl.TB.Inheritance.exercises;

/**
 * Created by sit0 on 25.05.17.
 */
class Cabriolet extends Car {
    private int lookRating;
    private boolean roof;

    public Cabriolet(String model, String transmission, int lookRating, boolean roof) {
        super(model, transmission);
        this.lookRating = lookRating;
        this.roof = roof;
    }

    public Cabriolet(boolean steeringWheel, boolean engine, boolean breaks, boolean wheels, int speed, int gear, String model, String transmission, int lookRating, boolean roof) {
        super(steeringWheel, engine, breaks, wheels, speed, gear, model, transmission);
        this.lookRating = lookRating;
        this.roof = roof;
        System.out.println("Cabriolet z innym konstruktorem");
    }

    private void roofOpen(){
        System.out.println("Otwieram dach");
        roof = true;
    }

    private void roofClose(){
        System.out.println("Zamykam dach");
        roof = false;
    }

    private void roofStatus(){
        if(roof == true)
            System.out.println("Dach jest otwarty");
        if (roof == false)
            System.out.println("Dachjest zamknięty");

    }

    @Override
    protected void run() {
        System.out.println("!Ovverrided run z klasy Cabriolet");
        roofStatus();
        if(!roof) {
            roofOpen();
        }
        checkLookRating();
        super.run();
        roofClose();
    }

    private void checkLookRating(){
        if (lookRating > 5)
            System.out.println("Mój wygląd oceniam na: " + lookRating + ".Wyglądam cool!");
        else
            System.out.println("Mój wygląd oceniam na: " + lookRating + ".Wyglądam słabo :-(");
    }

}
