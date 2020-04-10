package designpattern.strategy;

public class Subtraction implements Operation {
    @Override
    public void performAction(int value1, int value2) {
        System.out.println(value1-value2);
    }
}
