package com.example.springbootapirestcrud.service;

import com.example.springbootapirestcrud.exception.ResourceNotFoundException;
import com.example.springbootapirestcrud.model.Person;
import com.example.springbootapirestcrud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    public List<Person> findAll (){

        return repository.findAll();
    }

    public Person findById(Long id){

        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
    }

    public Person create (Person person){

        return repository.save(person);
    }

    public Person update (Person p){

        Person person = repository.findById(p.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
        person.setFirstName(p.getFirstName());
        person.setLastName(p.getLastName());
        person.setAdress(p.getAdress());
        person.setGender(p.getGender());

        return   repository.save(person);
    }

    public void delete (Long id){
        Person person = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
        repository.delete(person);
    }
}
