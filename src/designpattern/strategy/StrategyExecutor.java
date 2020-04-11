package designpattern.strategy;

public class StrategyExecutor {
    public static void main(String[] args) {
        StrategyBuilder addition = new StrategyBuilder(new Addition());
        addition.execute(2,3);

        StrategyBuilder subtraction = new StrategyBuilder(new Subtraction());
        subtraction.execute(4,3);


    }
}
