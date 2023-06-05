package com.example.darna.dao.repository;

import com.example.darna.dao.entities.Commentaire;
import com.example.darna.dao.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User,Integer> {
    @Query("select a from User a")
    List<User> getAllUsers();
    User findUserById(int id);
    void deleteUserById(int id);
}
