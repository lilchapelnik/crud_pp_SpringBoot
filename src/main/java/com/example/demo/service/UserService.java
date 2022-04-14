package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User findById(int id){
    return userRepository.getById(id);
    }
    public List<User> findAll(){
        return userRepository.findAll();

    }
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void deleteById(int id){
        userRepository.deleteById(id);
    }
}
