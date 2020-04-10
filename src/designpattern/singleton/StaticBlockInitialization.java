package designpattern.singleton;

public class StaticBlockInitialization {
    private StaticBlockInitialization() {}
    private static StaticBlockInitialization initialization;

    static {
        try {
            initialization = new StaticBlockInitialization();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static StaticBlockInitialization getInstance() {
        return initialization;
    }
}
