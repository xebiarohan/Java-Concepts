package designpattern.adapter.secondexample;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void resize() {
        System.out.println("Resizing square");
    }

    @Override
    public void description() {
        System.out.println("Square description");
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
