package com.example.darna.service.serviceInterfaces;

import com.example.darna.dao.entities.Adresse;
import com.example.darna.dao.entities.User;

import java.util.List;

public interface UserResource {
    User addUser (User user);
    User updateUser (User user);
    List<User> getAllUser();
    User getUserById(int id);
    void deleteUser(int id);
    void deleteUser(User user);
}
