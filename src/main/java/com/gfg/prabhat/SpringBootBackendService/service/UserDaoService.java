package com.gfg.prabhat.SpringBootBackendService.service;

import com.gfg.prabhat.SpringBootBackendService.model.User;
import com.gfg.prabhat.SpringBootBackendService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDaoService{ //implements CommandLineRunner{
    @Autowired
    UserRepository userRepository;

    /*@Override
    public void run(String... args) throws Exception {
        User user1=new User("Rod","Brod");
        User user2=new User("Bob","Rob");

        userRepository.save(user1);
        userRepository.save(user2);


    }*/
    public List<User> findAllUsers(){

        List<User> users=userRepository.findAll();
        return users;
    }


    public Optional<User> findUserById(Long id){
        return userRepository.findById(id);
    }
    public Optional<User> createUser(User user){
        userRepository.save(user);
        return userRepository.findById(user.getId());
    }
   public User updateUser(User user){
       /*user2.setFirstName("Brain");
       userRepository.save(user2);*/
        userRepository.save(user);
        return user;
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }



}
