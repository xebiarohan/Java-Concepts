package designpattern.abstractfactory;

public class FactoryProvider {
    public static AbstractFactory getShapeFactory(FactoryTypes factoryName) {
        if(FactoryTypes.TWO_D_SHAPE_FACTORY.equals(factoryName)) {
            return new TwoDAbstractFactory();
        } else {
            return new ThreeDAbstractFactory();
        }
    }
}
