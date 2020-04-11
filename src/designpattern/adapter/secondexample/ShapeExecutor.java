package designpattern.adapter.secondexample;

import java.util.ArrayList;
import java.util.List;

public class ShapeExecutor {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle());
        shapes.add(new Square());

        //Using shape adapter

        shapes.add(new ShapeAdapter(new Rhombus()));
        shapes.add(new ShapeAdapter(new Parallelogram()));

        shapes.stream().forEach(shape -> shape.draw());
    }
}
