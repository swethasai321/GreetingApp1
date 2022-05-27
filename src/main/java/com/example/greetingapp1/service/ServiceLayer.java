package com.example.greetingapp1.service;


import com.example.greetingapp1.entity.User;
import com.example.greetingapp1.repository.SpringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceLayer {
    @Autowired
    SpringRepository springRepository;
    public String sayHello() {
        return "Hello World!!";
    }
    public String sayPostHello(User user) {
        User newUser = new User();
        return "Hello "+ newUser;
    }

    public User sayHello(User user){
        User newuser = new User();
        springRepository.save(newuser);
        return newuser;
    }
}