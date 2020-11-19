package com.example.springbootapirestcrud.repository;

import com.example.springbootapirestcrud.data.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository <Person, Long> {
}
