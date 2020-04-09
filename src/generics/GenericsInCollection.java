package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInCollection {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();

        list.add(10);  // will add 10 to the list
       // list.add("alpha");   it will give Compile time exception


    }
}
