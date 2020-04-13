package designpattern.abstractfactory;

public class ThreeDAbstractFactory extends AbstractFactory {
    @Override
    public Shape getShape(String name) {
        System.out.println("3D shape");
        if (name == "circle") {
            return new Circle();
        } else {
            return new Square();
        }
    }
}
