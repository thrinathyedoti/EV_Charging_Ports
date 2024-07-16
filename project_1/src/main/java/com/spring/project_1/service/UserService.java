package com.spring.project_1.service;

import com.spring.project_1.model.User;
import com.spring.project_1.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public void addUser(User user){
        userRepo.save(user);
    }

    public List<User> allUsers(){
        return userRepo.findAll();
    }

    public User userById(int id){
        return userRepo.findById(id).orElse(null);
    }

    public void deleteById(int id){
        userRepo.deleteById(id);
    }
}
