package comparatorandcomparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Examples {
    public static void main(String[] args) {

        // Primitive types
        int[] intArr = {5,9,1,10};
        Arrays.sort(intArr);

        // Wrapper classes like Integer
        Integer i1 =1;
        Integer i2 = 2;

        int i = i1.compareTo(i2);

        // String class

        String str1 = "alpha";
        String str2 = "beta";

        int i3 = str1.compareTo(str2);   // -1,0,1

        // Custom Class
        Employee employee1 = new Employee();
            employee1.setAge("21");
            employee1.setDepartment("Technical");
            employee1.setName("Bob");

         Employee employee2 = new Employee();
            employee2.setAge("24");
            employee2.setName("Alex");
            employee2.setDepartment("HR");

        Collections.sort(Arrays.asList(employee1,employee2));  // it will sort list based on age because in
                                                                // employee class we added age condition in
                                                                // compareTO method


        // Comparator
        Comparator<Employee> comparing = Comparator
                .comparing(Employee::getAge)
                .thenComparing(Employee::getDepartment)
                .reversed();
    }
}
