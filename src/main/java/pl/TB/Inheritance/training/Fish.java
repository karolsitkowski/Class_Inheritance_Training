package pl.TB.Inheritance.training;

/**
 * Created by sit0 on 25.05.17.
 */
public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void swim(int speed){
        moveMuscels();
        moveBackfin();
        super.move(speed);

    }

    private void moveMuscels(){

    }

    private void moveBackfin(){

    }
}
