package pl.TB.Composition.exercises;

/**
 * Created by sit0 on 30.05.17.
 */
public class Time {
    private int hour;
    private int minutes;
    private int seconds;

    public Time(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void print(){
        System.out.println(hour+":"+minutes+":"+seconds);
    }
}
