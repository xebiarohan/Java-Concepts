package designpattern.singleton;

public class EagerInitialization {
    private EagerInitialization() {}

    private static final EagerInitialization instance = new EagerInitialization();

    public static EagerInitialization getInstance() {
        return instance;
    }
}
