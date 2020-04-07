package designpattern.builder;

public class Employee {
    private String name;
    private int age;
    private String company;
    private String department;

    public static class EmployeeBuilder {
        private String name;
        private int age;
        private String company;
        private String department;

        public EmployeeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder withCompany(String company) {
            this.company = company;
            return this;
        }

        public EmployeeBuilder withDepartment(String department) {
            this.department = department;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee(this);
            return employee;
        }
    }

    public Employee(EmployeeBuilder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.company = builder.company;
        this.department = builder.department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }

    public String getDepartment() {
        return department;
    }
}
