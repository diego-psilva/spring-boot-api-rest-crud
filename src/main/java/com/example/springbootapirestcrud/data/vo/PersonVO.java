package com.example.springbootapirestcrud.data.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@JsonPropertyOrder({"id", "firstName", "lastName", "gender", "adress"})
public class PersonVO implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    @JsonProperty("address")
    private String adress;
    private String gender;

    public PersonVO(){}

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
        if (!(o instanceof PersonVO)) return false;
        PersonVO personVO = (PersonVO) o;
        return getId().equals(personVO.getId()) &&
                getFirstName().equals(personVO.getFirstName()) &&
                getLastName().equals(personVO.getLastName()) &&
                getAdress().equals(personVO.getAdress()) &&
                getGender().equals(personVO.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getAdress(), getGender());
    }
}
