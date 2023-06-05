package com.example.darna.service;

import com.example.darna.dao.entities.User;
import com.example.darna.dao.repository.UserRepo;
import com.example.darna.service.serviceInterfaces.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserResource {
    @Autowired
    UserRepo userRepo;
    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userRepo.findUserById(id);
    }

    @Override
    public void deleteUser(int id) {
        userRepo.deleteUserById(id);
    }

    @Override
    public void deleteUser(User user) {
        userRepo.delete(user);
    }
}
