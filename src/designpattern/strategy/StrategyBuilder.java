package designpattern.strategy;

public class StrategyBuilder {
    private Operation operation;

    public StrategyBuilder(Operation operation) {
        this.operation = operation;
    }

    public void execute(int value1,int value2) {
        operation.performAction(value1,value2);
    }
}
