package tb_training;

/**
 * Created by sit0 on 25.05.17.
 */
public class Animal {

    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public void move(int speed){
        System.out.println("Move z klasy Animal z prędkością: " + speed);
    }

    public void eat(){
        System.out.println("Jem z klasy Animal");
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
