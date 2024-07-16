package com.spring.project_1.controller;

import com.spring.project_1.model.User;
import com.spring.project_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("adduser")
    public String adduser(@RequestBody User user){
        userService.addUser(user);
        return "Successfully Registered, "+user.getFirstName()+" "+user.getLastName();
    }

    @GetMapping("allusers")
    public List<User> allUsers(){
        return userService.allUsers();
    }

    @RequestMapping("user/{id}")
    public User userById(@PathVariable int id){
        return userService.userById(id);
    }

    @RequestMapping("deletebyid/{userId}")
    public String deleteById(@PathVariable("userId") int id){
        String name=userById(id).getFirstName();
        userService.deleteById(id);
        return "deleted Successfully, "+name;
    }
}


