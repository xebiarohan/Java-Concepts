package designpattern.adapter.secondexample;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Rectangle");
    }

    @Override
    public void description() {
        System.out.println("Rectangle description");
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
