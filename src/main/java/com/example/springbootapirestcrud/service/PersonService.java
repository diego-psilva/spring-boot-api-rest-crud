package com.example.springbootapirestcrud.service;

import com.example.springbootapirestcrud.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();

    public Person findById(String id){

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Phill");
        person.setLastName("Collin");
        person.setAdress("Hall Street, New York, USA");
        person.setGender("male");

        return person;
    }

    public List<Person> findAll (){

        List<Person> people = new ArrayList<>();

        for(int i = 0; i<9; i++){

            Person person = new Person();
            person.setId(counter.incrementAndGet());
            person.setFirstName("Phill "+i);
            person.setLastName("Collin "+i);
            person.setAdress("Hall Street "+ i +", New York, USA");
            person.setGender("male");

            people.add(person);
        }

        return people;
    }
}
