package generics;

public class ClassWithGenericMethod {
    public static void main(String[] args) {

    }


    // return type can be anything including type parameters also like in this case E

    public <T,E> E genericMethod(T key,E value) {
        System.out.println(key);
        System.out.println(value);
        return value;
    }


    public static <T> int countAllOccurrences(T[] list, T item) {
        int count = 0;
        if (item == null) {
            for ( T listItem : list )
                if (listItem == null)
                    count++;
        }
        else {
            for ( T listItem : list )
                if (item.equals(listItem))
                    count++;
        }
        return count;
    }
}
