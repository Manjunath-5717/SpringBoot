package com.javatech.validationexample.service;

import com.javatech.validationexample.dto.UserRequest;
import com.javatech.validationexample.entity.User;
import com.javatech.validationexample.exception.UserNOtFoundException;
import com.javatech.validationexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(UserRequest userRequest) {

        User user = User.build(
                0,
                userRequest.getName(),
                userRequest.getEmail(),
                userRequest.getMobile(),
                userRequest.getGender(),
                userRequest.getAge(),
                userRequest.getNationality()
        );

        return repository.save(user);
    }

    public List<User> getAllUser() {
        return repository.findAll();
    }

    public User getUser(int id) {

        User user = repository.findByUserID(id);

        if (user != null) {
            return user;
        } else {
            throw new UserNOtFoundException(
                    "User not found with id: " + id
            );
        }
    }
}