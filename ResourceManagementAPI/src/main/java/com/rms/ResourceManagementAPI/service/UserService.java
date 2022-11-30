package com.rms.ResourceManagementAPI.service;

import com.rms.ResourceManagementAPI.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    public User saveUser(User user);
    public List<User> getAllUsers();
    public Optional<User> getSpecificUser(UUID userUUID);
    public boolean existsUserByUserId(UUID userUUID);
}
