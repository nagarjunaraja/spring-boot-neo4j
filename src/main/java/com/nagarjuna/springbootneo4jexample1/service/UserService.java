package com.nagarjuna.springbootneo4jexample1.service;

import com.nagarjuna.springbootneo4jexample1.model.User;
import com.nagarjuna.springbootneo4jexample1.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Collection<User> getAll() {
        return userRepository.getAllUsers();
    }
}
