package serialization;

import java.beans.Transient;
import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 112312433445234123L;

    private String name;
    private String company;
    private Integer age;
    private Long phoneNumber;
    transient private Integer salary;   // will not be serialized
    private Address address;

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
