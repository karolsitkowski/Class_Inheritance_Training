package pl.TB.Composition.training;

/**
 * Created by sit0 on 26.05.17.
 */
public class PC {

    private Case myCase;
    private Monitor myMonitor;
    private Motherboard myMotherbord;

    public PC(Case myCase, Monitor myMonitor, Motherboard myMotherbord) {
        this.myCase = myCase;
        this.myMonitor = myMonitor;
        this.myMotherbord = myMotherbord;
    }

    protected void powerUp(){
        myCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        myMonitor.drawPixelAt(1050,320,"red");
    }

}
