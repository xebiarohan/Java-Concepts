package designpattern.factory;

public class Executor {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory("Rectangle");
        Shape shape = factory.getShape();
        shape.name();
    }
}
