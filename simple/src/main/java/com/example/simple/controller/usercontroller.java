package com.example.simple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.simple.model.user;
import com.example.simple.repository.userrepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class usercontroller {

    @Autowired
    private userrepository userrepository;
    @PostMapping("/sanjay")
    public user newuUser(@RequestBody user newUser){
        return userrepository.save(newUser);
    }

    @GetMapping("/users")
    public List<user> getAllUsers(){
        return userrepository.findAll();
    }

    @DeleteMapping("/{id}")
    public List<user> deleteRecord(@PathVariable Long id){
        userrepository.deleteById(id);
        return userrepository.findAll();
    }
    
}
