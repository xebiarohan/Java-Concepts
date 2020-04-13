package designpattern.abstractfactory;

public class Application {
    public static void main(String[] args) {
        AbstractFactory factory1 = FactoryProvider.getShapeFactory(FactoryTypes.TWO_D_SHAPE_FACTORY);

        Shape circle = factory1.getShape("circle");

        circle.draw();

        AbstractFactory factory2 = FactoryProvider.getShapeFactory(FactoryTypes.THREE_D_SHAPE_FACTORY);

        Shape square = factory2.getShape("square");

        square.draw();

    }
}
