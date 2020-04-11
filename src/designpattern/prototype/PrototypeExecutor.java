package designpattern.prototype;

public class PrototypeExecutor {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee();
        emp1.loadData();

        Employee emp2 = (Employee)emp1.clone();

        emp2.getEmployees();
    }
}
