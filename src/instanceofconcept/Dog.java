package instanceofconcept;

public class Dog extends Animal implements Pet{

    public static void main(String[] args) {
        Dog instance = new Dog();

        System.out.println(instance instanceof Dog);

        System.out.println(instance instanceof Animal);

        System.out.println(instance instanceof Pet);
    }

    @Override
    public void type() {
        System.out.println("DOG");
    }
}
