package bindings;

public class BindingExecutor {

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();        // Start Car will print using late-binding (overriding)
        Vehicle.stop();         // Start Vehicle will print using early binding
    }
}
