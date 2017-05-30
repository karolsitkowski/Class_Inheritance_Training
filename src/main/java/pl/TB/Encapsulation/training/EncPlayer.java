package pl.TB.Encapsulation.training;

/**
 * Created by sit0 on 30.05.17.
 */
public class EncPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EncPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <=100){
            this.health = health;
        }
        this.weapon = weapon;
        System.out.println("Player " + name + " is constructed");
    }

    public void looseHealth(int damage){
        this.health -= damage;
        System.out.println("Player is punched for: " + damage);
        if(this.health <= 0){
            System.out.println("Player loose live");
        }
    }

    public int getHealth() {
        return health;
    }
}
