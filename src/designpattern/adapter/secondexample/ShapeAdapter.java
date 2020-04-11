package designpattern.adapter.secondexample;

public class ShapeAdapter implements Shape {
    private AdvancecShapes advancecShapes;

    public ShapeAdapter(AdvancecShapes advancecShapes) {
        this.advancecShapes = advancecShapes;
    }
    @Override
    public void draw() {
        advancecShapes.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("This method is not supported for this shape");
    }

    @Override
    public void description() {
        advancecShapes.describe();
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
