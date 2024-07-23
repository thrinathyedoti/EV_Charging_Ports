package com.spring.project_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServices userServices;

    @RequestMapping("adduser")
    public String adduser(@RequestBody User user){

        userServices.addUser(user);
        return "Successfully Registered, "+user.getFirstName()+" "+user.getLastName();
    }

    @GetMapping("allusers")
    public List<User> allUsers(){
        return userServices.allUsers();
    }

    @RequestMapping("user/{id}")
    public User userById(@PathVariable int id){
        return userServices.userById(id);
    }

    @RequestMapping("deletebyid/{userId}")
    public String deleteById(@PathVariable("userId") int id){
        String name=userById(id).getFirstName();
        userServices.deleteById(id);
        return "deleted Successfully, "+name;
    }
}


