package designpattern.factory;

public class ShapeFactory {
    private String string;

    public ShapeFactory(String string) {
        this.string = string;
    }

    public Shape getShape() {
        if(this.string == "Rectangle") {
            return new Rectangle();
        } else {
            return new Square();
        }
    }
}
