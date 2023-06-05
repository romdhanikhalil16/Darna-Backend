package com.example.darna.dao.repository;

import com.example.darna.dao.entities.Commentaire;
import com.example.darna.dao.entities.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepo extends CrudRepository<Role,Integer> {
    @Query("select a from Role a")
    List<Role> getAllRoles();
    Role findRoleById(int id);
    void deleteRoleById(int id);
}
