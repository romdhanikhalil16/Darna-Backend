package com.example.darna.controllers;

import com.example.darna.dao.entities.History;
import com.example.darna.dao.entities.Role;
import com.example.darna.service.serviceInterfaces.HistoryResource;
import com.example.darna.service.serviceInterfaces.RoleResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleResource roleResource;
    @PostMapping("addRole")
    Role ajouterRole(@RequestBody Role role) {
        return roleResource.addRole(role);
    }
    @GetMapping("GetRole")
    public Role RoleParId(@RequestParam int id) {
        return roleResource.getRoleById(id);
    }
    @GetMapping("GetAll")
    public List<Role> RoleList() {
        return roleResource.getAllRole();
    }
    //thabeto fiha
    @DeleteMapping("DeleteRole")
    void deleteRole(@RequestBody Role role){
        roleResource.deleteRole(role);
    }
    @DeleteMapping("DeletRoleId")
    void deleteRoleId(@RequestParam int id){
        roleResource.deleteRole(id);
    }
    @PutMapping("modifierRole")
    void updateRole(@RequestBody Role role){
        roleResource.updateRole(role);
    }
}
