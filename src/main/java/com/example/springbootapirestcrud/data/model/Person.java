package com.example.springbootapirestcrud.data.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "person")
public class Person implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name",length = 80, nullable = false)
    private String firstName;

    @Column(name = "last_name",length = 80, nullable = false)
    private String lastName;

    @Column (nullable = false)
    private String adress;

    @Column(length = 6, nullable = false)
    private String gender;

    public Person(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person personVO = (Person) o;
        return Objects.equals(getId(), personVO.getId()) &&
                Objects.equals(getFirstName(), personVO.getFirstName()) &&
                Objects.equals(getLastName(), personVO.getLastName()) &&
                Objects.equals(getAdress(), personVO.getAdress()) &&
                Objects.equals(getGender(), personVO.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getAdress(), getGender());
    }
}
