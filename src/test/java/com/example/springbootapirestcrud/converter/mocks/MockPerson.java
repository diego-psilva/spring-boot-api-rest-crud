package com.example.springbootapirestcrud.converter.mocks;

import com.example.springbootapirestcrud.data.model.Person;

import java.util.ArrayList;
import java.util.List;

public class MockPerson {


    public Person mockEntity() {
    	return mockEntity(0);
    }
    
    public com.example.springbootapirestcrud.data.vo.PersonVO mockVO() {
    	return mockVO(0);
    }
    
    public List<Person> mockEntityList() {
        List<Person> personVOS = new ArrayList<Person>();
        for (int i = 0; i < 14; i++) {
            personVOS.add(mockEntity(i));
        }
        return personVOS;
    }

    public List<com.example.springbootapirestcrud.data.vo.PersonVO> mockVOList() {
        List<com.example.springbootapirestcrud.data.vo.PersonVO> personVOS = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            personVOS.add(mockVO(i));
        }
        return personVOS;
    }
    
    private Person mockEntity(Integer number) {
    	Person personVO = new Person();
    	personVO.setAdress("Addres Test" + number);
        personVO.setFirstName("First Name Test" + number);
        personVO.setGender(((number % 2)==0) ? "Male" : "Female");
        personVO.setId(number.longValue());
        personVO.setLastName("Last Name Test" + number);
        return personVO;
    }

    private com.example.springbootapirestcrud.data.vo.PersonVO mockVO(Integer number) {
    	com.example.springbootapirestcrud.data.vo.PersonVO personVO = new com.example.springbootapirestcrud.data.vo.PersonVO();
    	personVO.setAdress("Addres Test" + number);
        personVO.setFirstName("First Name Test" + number);
        personVO.setGender(((number % 2)==0) ? "Male" : "Female");
        personVO.setId(number.longValue());
        personVO.setLastName("Last Name Test" + number);
        return personVO;
    }

}
