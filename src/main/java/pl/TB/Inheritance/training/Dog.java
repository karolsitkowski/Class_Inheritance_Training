package pl.TB.Inheritance.training;

/**
 * Created by sit0 on 25.05.17.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name,1,1,size,weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("chew from dog class");
    }

    @Override
    public void eat() {
        System.out.println("Eat z klasy dog override");
        chew();
        super.eat();
    }

    @Override
    public void move(int speed) {
        System.out.println("Ovverrided.move from dog class");
        moveLegs(speed);
        super.move(speed);

    }

    private void moveLegs(int speed){
        System.out.println("Dog.movelegs()");
    }

    public void walk(){
        System.out.println("walk from dog class");
        super.move(5);
    }
    public void run(){
        System.out.println("run from dog class");
        move(10);
    }
}
