package com.workshop.person.controller;

import com.workshop.person.entity.Person;
import com.workshop.person.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/person")
@Slf4j
@CrossOrigin("*")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @Value("${user.role}")
    private String role;

    @GetMapping
    public ResponseEntity<?> getALL(){
        System.out.println("El role es : "+role);
        return ResponseEntity.ok(personRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        return ResponseEntity.ok(personRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Person person){
        try {
            return new ResponseEntity<>(personRepository.save(person), HttpStatus.CREATED);
        }catch (Exception e){
            log.info("error: "+e);
            return null;
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Person person, @PathVariable Long id){
        Optional<Person> personById = personRepository.findById(id);
        personById.get().setName(person.getName());
        return ResponseEntity.ok(personRepository.save(personById.get()));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        personRepository.deleteById(id);
        return new ResponseEntity<>("Object deleted",HttpStatus.OK);
    }

}
