package equalsandhashcode;

import java.util.Objects;

public class EqualsAndHashCodeExample {

    private String firstName;
    private String lastName;
    private Integer age;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsAndHashCodeExample that = (EqualsAndHashCodeExample) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, age);
    }
}
