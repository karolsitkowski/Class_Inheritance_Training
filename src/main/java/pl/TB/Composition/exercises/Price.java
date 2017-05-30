package pl.TB.Composition.exercises;

/**
 * Created by sit0 on 30.05.17.
 */
public class Price {

    int value;
    String currency;

    public Price(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public String price(){

        return (value + " " + currency);
    }

    public void print(){
        System.out.println(value + " " + currency);
    }
}
