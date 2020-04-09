package generics;

public class ClassWithGenericConstructor {
    public <T> ClassWithGenericConstructor(T key,T value) {
        System.out.println(key);
    }
}
