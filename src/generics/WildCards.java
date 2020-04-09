package generics;

import java.util.*;

public class WildCards<T> {
    public static void main(String[] args) {
        Collection<?> coll = new ArrayList<Integer>();  // Here we can use any class like Integer

        List<? extends Number> list = new ArrayList<Long>(); // Here we can use classed which extends Number like Long

        Map<String,?> pair = new HashMap<String,Integer>();  // Second parameter can be anything


        // Unbounded
        Collection<?> collection = new ArrayList<Integer>();


        // bounded
        // Extend Example
        List<? extends Number> list1 = new ArrayList<Long>();

        // Super Example
        List<? super Integer> list2 = new ArrayList<Number>();
    }
}
