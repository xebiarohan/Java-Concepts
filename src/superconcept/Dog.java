package superconcept;

public class Dog extends Animal implements Name {
    String category = "Dog";
   public void getCategory() {
       System.out.println(category);
       System.out.println("Main Category :" + super.category);
   }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getCategory();
    }

    public String getName() {
       return Name.super.getName();
    }
}
