package designpattern.singleton;

public class SingletonExecutor {
    public static void main(String[] args) {
        EnumInitialization instance = EnumInitialization.INSTANCE;
        instance.doSomething();

        EagerInitialization eagerInitialization = EagerInitialization.getInstance();

        Lazyinitialization lazyinitialization = Lazyinitialization.getInstance();
    }
}
