package com.example.darna.service.serviceInterfaces;

import com.example.darna.dao.entities.Adresse;
import com.example.darna.dao.entities.Role;

import java.util.List;

public interface RoleResource {
    Role addRole (Role role);
    Role updateRole (Role role);
    List<Role> getAllRole();
    Role getRoleById(int id);
    void deleteRole(int id);
    void deleteRole(Role role);
}
