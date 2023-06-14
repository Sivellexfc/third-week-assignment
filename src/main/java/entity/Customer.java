package entity;

import java.util.Date;

public class Customer {

    private String name;
    private String lastName;
    private long identityNo;
    private String seatNo;

    private String birthDate;

    public Customer(String name, String lastName, long indentityNo, String birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.identityNo = indentityNo;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(long identityNo) {
        this.identityNo = identityNo;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

}
