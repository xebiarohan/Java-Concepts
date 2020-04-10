package designpattern.singleton;

public class Lazyinitialization {
    private static Lazyinitialization instance;

    private Lazyinitialization() {}

    public static Lazyinitialization getInstance() {
        if(instance == null) {
            instance = new Lazyinitialization();
        }
        return instance;
    }
}
