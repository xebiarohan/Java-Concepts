package designpattern.singleton;

public class ThreadSafeInitialization {
    private static ThreadSafeInitialization instance;

    private ThreadSafeInitialization() {}

    public static ThreadSafeInitialization getInstance() {
        synchronized (ThreadSafeInitialization.class) {
            if(instance == null) {
                instance = new ThreadSafeInitialization();
            }
        }
        return instance;
    }
}
