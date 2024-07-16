package com.spring.project_1.service;

import com.spring.project_1.model.User;
import com.spring.project_1.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

//    ArrayList<User> user=new ArrayList<>();
//     public UserService(){
//        users.add(new User(1,"chris","hemsworth","chris@gmail.com","8309690246"));
//    }

    public void addUser(User user){
//        user.add(user);
        userRepo.save(user);
    }

    public List<User> allUsers(){
        return userRepo.findAll();
//        return user;
    }

    public User userById(int id){
//         for(int i=0;i<user.size();i++){
//             if(id==user.get(i).getUserId()){
//                 return user.get(i);
//             }
//         }
        return userRepo.findById(id).orElse(null);
    }

    public void deleteById(int id){
//        for (int i=0;i<user.size();i++){
//            if(user.get(i).getUserId()==id){
//                user.remove(i);
//            }
//        }
        userRepo.deleteById(id);
    }
}
