package pl.TB.Composition.exercises;

/**
 * Created by sit0 on 30.05.17.
 */
public class Clock {

    String clockName;
    private Time clockTime;
    Price clockPrice;

    public Clock(String clockName, Time clockTime, Price clockPrice) {
        this.clockName = clockName;
        this.clockTime = clockTime;
        this.clockPrice = clockPrice;
    }

    public void printTime (){
        clockTime.print();
    }




}
