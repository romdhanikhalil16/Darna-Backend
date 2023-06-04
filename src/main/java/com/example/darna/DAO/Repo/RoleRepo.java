package com.example.darna.DAO.Repo;

import com.example.darna.DAO.entities.Role;
import com.example.darna.DAO.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepo extends CrudRepository<Role,Integer> {
}
