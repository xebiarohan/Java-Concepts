package comparatorandcomparable;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    private String name;
    private String age;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getAge().compareTo(o.getAge());
    }
}
