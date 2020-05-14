package valuepassing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValuePassingConcept {
    public static void main(String[] args) {
        int a = 10;
        changePrimitiveType(a);
        System.out.println(a);   //10

        int[] arr = {1, 2, 3, 4};
        changeIntArrayValue(arr);   //20
        System.out.println(arr[0]);


        changeArray(arr);
        System.out.println(arr[0]); //20


        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        changeList(intList);
        System.out.println(intList);


        Person person = new Person("Rohan");
        setNewName(person);
        System.out.println(person.getName());   //Vishu

        createNewName(person);
        person.getName();
        System.out.println(person.getName());   //Vishu

    }

    public static void changePrimitiveType(int num) {
        num = 20;
    }


    public static void changeIntArrayValue(int[] array) {
        array[0] = 20;
    }

    public static void changeArray(int[] array) {
        array = new int[5];
        array[0] = 50;
    }

    public static void changeList(List<Integer> integers) {
        System.out.println(integers.size());
        integers.add(5);
    }

    public static void setNewName(Person person) {
        Person p = person;
        p.setName("Vishu");
    }

    public static void createNewName(Person person) {
        person = new Person("Rohan");
    }
}
