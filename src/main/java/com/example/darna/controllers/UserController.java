package com.example.darna.controllers;

import com.example.darna.dao.entities.History;
import com.example.darna.dao.entities.Role;
import com.example.darna.dao.entities.User;
import com.example.darna.service.serviceInterfaces.RoleResource;
import com.example.darna.service.serviceInterfaces.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserResource userResource;
    @PostMapping("addUser")
    User ajouterUser(@RequestBody User user) {
        return userResource.addUser(user);
    }
    @GetMapping("GetUser")
    public User UserParId(@RequestParam int id) {
        return userResource.getUserById(id);
    }
    @GetMapping("GetAll")
    public List<User> RoleList() {
        return userResource.getAllUser();
    }
    //thabeto fiha
    @DeleteMapping("DeleteUser")
    void deleteUser(@RequestBody User user){
        userResource.deleteUser(user);
    }
    @DeleteMapping("DeletUseryId")
    void deleteUserId(@RequestParam int id){
        userResource.deleteUser(id);
    }
    @PutMapping("modifierUser")
    void updateUser(@RequestBody User user){
        userResource.updateUser(user);
    }
}
