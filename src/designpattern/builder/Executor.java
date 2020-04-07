package designpattern.builder;

public class Executor {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder()
                .withName("Rohan Aggarwal")
                .withAge(24)
                .withDepartment("Research and Development")
                .withCompany("Emirates")
                .build();

    }
}
