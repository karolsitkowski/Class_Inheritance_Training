package pl.TB.exercises;

/**
 * Created by sit0 on 25.05.17.
 */
class Cabriolet extends Car {
    private int lookRating;
    private boolean roof;

    public Cabriolet(boolean steeringWheel, boolean engine, boolean breaks, boolean wheels, int speed, String model, String transmission, int lookRating, boolean roof) {
        super(steeringWheel, engine, breaks, wheels, speed, model, transmission);
        this.lookRating = lookRating;
        this.roof = roof;
    }

    private void roofOpen(){
        roof = true;
    }

    private void roofClose(){
        roof = false;
    }

    private void roofStatus(){
        if(roof == true)
            System.out.println("Dach jest otwarty");
        if (roof == false)
            System.out.println("Dachjest zamknięty");


    }

}
