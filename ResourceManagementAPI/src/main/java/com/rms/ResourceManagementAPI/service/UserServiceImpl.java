package com.rms.ResourceManagementAPI.service;

import com.rms.ResourceManagementAPI.model.User;
import com.rms.ResourceManagementAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getSpecificUser(UUID userUUID) {
        return userRepository.findById(userUUID);
    }

    @Override
    public boolean existsUserByUserId(UUID userUUID){
        if(this.getSpecificUser(userUUID).isEmpty()){return false;}
        else{return true;}

//        if(userRepository.findById(userUUID).isPresent()){return true;}
//        else{return false;}
    }
}
