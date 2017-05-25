package pl.TB.training;

/**
 * Created by sit0 on 25.05.17.
 */
public class Main {
    public static void main(String[] args) {

        Animal myAnimal = new Animal("General Animal",1,1,5,6);
        Dog myDog = new Dog("Dudus",10,7,1,4,1,24,"long");

        //myDog.eat();
        myDog.walk();
        System.out.println("--------------------------");
        myDog.run();
    }
}
