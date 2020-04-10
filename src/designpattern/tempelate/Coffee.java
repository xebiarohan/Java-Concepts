package designpattern.tempelate;

public class Coffee extends Beverage {
    @Override
    protected void addMilk() {
        System.out.println("Add milk");
    }

    @Override
    protected void addBeverageIngredient() {
        System.out.println("Add Coffee powder");
    }

    @Override
    protected void addSuger() {
        System.out.println("Add Suger");
    }
}
