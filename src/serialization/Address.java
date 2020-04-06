package serialization;

import java.io.Serializable;

public class Address implements Serializable {

    private static final long serialVersionUID = 123123123482347234L;

    private String street;
    private String city;
    private Integer pinCode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }
}
