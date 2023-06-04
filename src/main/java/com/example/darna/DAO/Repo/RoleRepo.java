package com.example.darna.DAO.Repo;

import com.example.darna.DAO.entities.Role;
import com.example.darna.DAO.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends CrudRepository<Role,Integer> {
}
