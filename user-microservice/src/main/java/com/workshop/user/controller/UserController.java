package com.workshop.user.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.workshop.user.dto.UserDTO;
import com.workshop.user.repository.UserRepository;
import com.workshop.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.google.gson.Gson;

import java.util.Arrays;


@Slf4j
@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAll(@RequestParam(name = "roles") String roles) throws JsonProcessingException {
        Gson gson = new Gson();
        String[] listaRoles = gson.fromJson(roles,String[].class);
        Arrays.stream(listaRoles).filter(s -> s.contains("realm")).forEach(System.out::println);
        System.out.println(userRepository.obtenerTodo());
        try {
            return new ResponseEntity<>(userService.getAll(),HttpStatus.OK);
        }catch (Exception e){
            log.info("error log: "+e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<?> save(@RequestBody UserDTO userDTO){
//        return new ResponseEntity<>(userService.save(userDTO), HttpStatus.CREATED);
//    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getById(@PathVariable("id") String id){
        return userService.getById(id)==null?
                new ResponseEntity<>(HttpStatus.NOT_FOUND):
                new ResponseEntity<>(userService.getById(id), HttpStatus.OK);
    }
}
