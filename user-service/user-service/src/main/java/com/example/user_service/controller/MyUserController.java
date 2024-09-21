package com.example.user_service.controller;


import com.example.user_service.model.MyUser;
import com.example.user_service.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MyUserController {
    @Autowired
    MyUserRepository userRepository;
    @PostMapping("/user")
    public ResponseEntity<MyUser> createUser(@RequestBody MyUser user){
        try{
            MyUser my_user = userRepository.save(new MyUser(user.getUsername(),
                    user.getPassword()));
            return new ResponseEntity<>(my_user, HttpStatus.CREATED);
        }catch (Exception ex){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/users")
    public ResponseEntity<List<MyUser>> getAllUsers(){
        try{
            List<MyUser> users = new ArrayList<MyUser>();
            userRepository.findAll().forEach(users::add);
            return new ResponseEntity<>(users, HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
