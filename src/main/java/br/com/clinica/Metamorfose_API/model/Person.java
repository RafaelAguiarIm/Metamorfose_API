package br.com.clinica.Metamorfose_API.model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String cpf;
    private String rg;
    private String birthDate;   // Assuming birthDate is a String for simplicity, could be LocalDate
    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public Person() {
    }

    public Person(Long id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Person(Long id, String cpf, String rg, String birthDate, String name, String email, String phone,
                  String address, String city, String state, String zipCode, String country) {
        this.id = id;
        this.cpf = cpf;
        this.rg = rg;
        this.birthDate = birthDate;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getId(), person.getId()) && Objects.equals(getCpf(), person.getCpf()) && Objects.equals(getRg(), person.getRg()) && Objects.equals(getBirthDate(), person.getBirthDate()) && Objects.equals(getName(), person.getName()) && Objects.equals(getEmail(), person.getEmail()) && Objects.equals(getPhone(), person.getPhone()) && Objects.equals(getAddress(), person.getAddress()) && Objects.equals(getCity(), person.getCity()) && Objects.equals(getState(), person.getState()) && Objects.equals(getZipCode(), person.getZipCode()) && Objects.equals(getCountry(), person.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCpf(), getRg(), getBirthDate(), getName(), getEmail(), getPhone(), getAddress(), getCity(), getState(), getZipCode(), getCountry());
    }
}
