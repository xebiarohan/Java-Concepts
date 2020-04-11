package designpattern.adapter.secondexample;

public class Parallelogram implements AdvancecShapes {
    @Override
    public void drawShape() {
        System.out.println("Drawing Parallelogram");
    }

    @Override
    public void describe() {
        System.out.println("Describing parallelogram");
    }
}
