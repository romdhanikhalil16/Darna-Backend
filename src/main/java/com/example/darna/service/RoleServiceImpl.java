package com.example.darna.service;

import com.example.darna.dao.entities.Role;
import com.example.darna.dao.repository.RoleRepo;
import com.example.darna.service.serviceInterfaces.RoleResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleResource {
    @Autowired
    RoleRepo roleRepo;
    @Override
    public Role addRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public Role updateRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public List<Role> getAllRole() {
        return roleRepo.getAllRoles();
    }

    @Override
    public Role getRoleById(int id) {
        return roleRepo.findRoleById(id);
    }

    @Override
    public void deleteRole(int id) {
        roleRepo.deleteRoleById(id);
    }

    @Override
    public void deleteRole(Role role) {
        roleRepo.delete(role);
    }
}
