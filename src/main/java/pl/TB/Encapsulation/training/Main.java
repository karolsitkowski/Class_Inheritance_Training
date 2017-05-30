package pl.TB.Encapsulation.training;

/**
 * Created by sit0 on 30.05.17.
 */
public class Main {
    public static void main(String[] args) {

        EncPlayer player = new EncPlayer("Tim", 50,"Sword");
        System.out.println("Health when started is: " + player.getHealth());

        EncPlayer player2 = new EncPlayer("Bob", 200,"Sword");
        System.out.println("Health when started is: " + player2.getHealth());
        player2.looseHealth(110);
    }
}
