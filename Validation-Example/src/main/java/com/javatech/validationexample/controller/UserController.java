package com.javatech.validationexample.controller;

import com.javatech.validationexample.dto.UserRequest;
import com.javatech.validationexample.entity.User;
import com.javatech.validationexample.exception.UserNOtFoundException;
import com.javatech.validationexample.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.javatech.validationexample.exception.UserNOtFoundException;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest){
        return new ResponseEntity<>(service.saveUser(userRequest), HttpStatus.CREATED);
    }
    @GetMapping("/fetchAll")
    public ResponseEntity<List<User>>getAllUser(){
        return ResponseEntity.ok(service.getAllUser());
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id) throws UserNOtFoundException {
        return ResponseEntity.ok(service.getUser(id));
    }

}
