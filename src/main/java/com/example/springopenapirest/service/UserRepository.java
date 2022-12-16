package com.example.springopenapirest.service;

import com.example.springopenapirest.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository <User, Long> {
    List<User> findUserByName(String name);
}
