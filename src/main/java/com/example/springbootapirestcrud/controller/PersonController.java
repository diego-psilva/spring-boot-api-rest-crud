package com.example.springbootapirestcrud.controller;

import com.example.springbootapirestcrud.data.model.Person;
import com.example.springbootapirestcrud.data.vo.PersonVO;
import com.example.springbootapirestcrud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping(produces = {"application/json", "application/xml", "application/x-yaml"})
    public List<PersonVO> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}", produces = {"application/json", "application/xml", "application/x-yaml"})
    public PersonVO findById(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PostMapping(produces = {"application/json", "application/xml", "application/x-yaml"}, consumes = {"application/json", "application/xml", "application/x-yaml"})
    public PersonVO create(@RequestBody PersonVO person){
        return service.create(person);
    }

    @PutMapping(produces = {"application/json", "application/xml", "application/x-yaml"}, consumes = {"application/json", "application/xml", "application/x-yaml"})
    public PersonVO update(@RequestBody PersonVO person){
        return service.update(person);
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<?> delete (@PathVariable("id") Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
