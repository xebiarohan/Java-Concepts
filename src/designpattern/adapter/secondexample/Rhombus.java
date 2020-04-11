package designpattern.adapter.secondexample;

public class Rhombus implements AdvancecShapes {
    @Override
    public void drawShape() {
        System.out.println("Drawing Rhombus");
    }

    @Override
    public void describe() {
        System.out.println("Rhombus Description");
    }
}
