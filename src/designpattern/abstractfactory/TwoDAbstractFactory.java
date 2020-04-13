package designpattern.abstractfactory;

public class TwoDAbstractFactory extends AbstractFactory {
    @Override
    public Shape getShape(String name) {
        System.out.println("2D shape");
        if (name == "circle") {
            return new Circle();
        } else {
            return new Square();
        }
    }
}
