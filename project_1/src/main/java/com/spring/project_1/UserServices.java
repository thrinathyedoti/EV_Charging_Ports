package com.spring.project_1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserServices {

    ArrayList<User> users = new ArrayList<>();

    public UserServices() {
        users.add(new User(1, "Chris", "Hemsworth", "chris@gmail.com", "9293947519"));
        users.add(new User(2, "peter", "parker", "parker@gmail.com", "9806947519"));
        users.add(new User(3, "robert", "downey", "downey@gmail.com", "9293987543"));
        users.add(new User(4, "Chris", "Evens", "chrisevens@gmail.com", "9211095519"));
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> allUsers() {
        return users;
    }

    public User userById(int userId) {
        for(User user:users){
            if(user.getUserId()==userId){
                return user;
            }
        }
        return null;
    }
    public String deleteById(int userId){
        for(int i=0;i<users.size();i++){
            if(users.get(i).getUserId()==userId){
                users.remove(i);
                return "Delete Successfully...";
            }
        }
        return "Invalid User Id...";
    }
}
