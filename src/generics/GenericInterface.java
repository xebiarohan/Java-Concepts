package generics;

public interface GenericInterface<T,E>  {
    T firstMethod();
    E secondMethod();

    default void thirdMethod() {
        System.out.println("Random text");
    }
}
