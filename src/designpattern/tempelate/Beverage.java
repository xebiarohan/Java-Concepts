package designpattern.tempelate;

public abstract class Beverage {

    protected abstract void addMilk();
    protected abstract void addBeverageIngredient();
    protected abstract void addSuger();

    public final void makeBeverage() {
        addMilk();
        addBeverageIngredient();
        addSuger();
    }
}
