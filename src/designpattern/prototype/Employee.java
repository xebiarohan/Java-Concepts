package designpattern.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee implements Cloneable {

    private List<String> employees;

    public Employee(List<String> employees) {
        this.employees = employees;
    }

    public Employee() {
        this.employees = new ArrayList<>();
    }

    public void loadData() {
        employees.add("Alex");
        employees.add("Max");
        employees.add("Stephen");
    }

    public List<String> getEmployees() {
        return employees;
    }

    public Object clone() throws CloneNotSupportedException {
        List<String> clonedList = employees.stream().collect(Collectors.toList());
        return new Employee(clonedList);
    }

}
