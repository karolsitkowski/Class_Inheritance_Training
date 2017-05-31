package pl.TB.Composition.training;

/**
 * Created by sit0 on 26.05.17.
 */
public class Dimensions {

    private int width;
    private int height;
    private int depth;

    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public void print(){
        System.out.println("Szerolość: " + width + ".Wyskość: " + height + ".Głębokość: " + depth);
    }
}
