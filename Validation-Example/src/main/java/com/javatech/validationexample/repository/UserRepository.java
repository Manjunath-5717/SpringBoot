package com.javatech.validationexample.repository;

import com.javatech.validationexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserID(int id);
}