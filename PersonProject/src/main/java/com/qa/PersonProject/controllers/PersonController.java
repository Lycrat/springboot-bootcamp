package com.qa.PersonProject.controllers;

import com.qa.PersonProject.entities.Person;
import com.qa.PersonProject.services.PersonService;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        super();
        this.personService = personService;
    }

    @PostMapping("/create")
    public boolean addPerson(@RequestBody @Valid Person person){
        return this.personService.addPerson(person);
    }

    @GetMapping("/health")
    public String health(){
        return "Testing: 1,2,3";
    }

    @GetMapping("/getAll")
    public List<Person> getAll(){
        return this.personService.getAll();
    }

    @PutMapping("/update")
    public Person updatePerson(@PathParam("id") Long id, @RequestBody @Valid Person person){
        return this.personService.updatePerson(id, person);
    }

    @DeleteMapping("/delete/{id}")
    public Person deletePerson(@PathVariable Long id){
       return this.personService.deletePerson(id);
    }

}
