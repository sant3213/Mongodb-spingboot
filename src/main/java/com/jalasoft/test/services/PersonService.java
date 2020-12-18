package com.jalasoft.test.services;

import com.jalasoft.test.model.Data;
import com.jalasoft.test.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public String savePerson(Data person){
        personRepository.save(person);
        return "ok";
    }
}
