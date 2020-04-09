package generics;

public class Executor implements GenericInterface<Integer,Integer> {
    public static void main(String[] args) {
        GenericClass<Integer,Integer> integers = new GenericClass<>();
        integers.setKey(10);   // works
        integers.setValue(20); // works
     //   integers.setValue("alpha");  compile time error




        GenericClass<String,String> strings = new GenericClass<>();

        strings.setKey("key");     // works
        strings.setValue("value");  // works
     //   strings.setValue(10);     compile time error

    }


    @Override
    public Integer firstMethod() {
        System.out.println("Generic method 1 from Generic interface");
        return 1;
    }

    @Override
    public Integer secondMethod() {
        System.out.println("Generic method 1 from Generic interface");
        return 2;
    }
}
