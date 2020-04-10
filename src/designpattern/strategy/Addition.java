package designpattern.strategy;

public class Addition implements Operation {
    @Override
    public void performAction(int value1, int value2) {
        System.out.println(value1+value2);
    }
}
