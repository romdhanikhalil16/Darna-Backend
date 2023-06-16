package com.example.darna.controllers;

import com.example.darna.dao.entities.Commentaire;
import com.example.darna.dao.entities.Criteria;
import com.example.darna.service.serviceInterfaces.CommentaireResource;
import com.example.darna.service.serviceInterfaces.CritaireResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/criteria")
public class CriteriaController {
    @Autowired
    CritaireResource critaireResource;
    @PostMapping("addCriteria")
    Criteria ajouterCriteria(@RequestBody Criteria criteria) {
        return critaireResource.addCriteria(criteria);
    }
    @GetMapping("GetCriteria")
    public Criteria CriteriaParId(@RequestParam int id) {
        return critaireResource.getCriteriaById(id);
    }
    @GetMapping("GetAll")
    public List<Criteria> CriteriaList() {
        return critaireResource.getAllCriteria();
    }
    //thabeto fiha
    @DeleteMapping("DeleteCriteria")
    void deleteCommentaire(@RequestBody Criteria criteria){
        critaireResource.deleteCriteria(criteria);
    }
    @DeleteMapping("DeletCriteriaId")
    void deleteCriteriaId(@RequestParam int id){
        critaireResource.deleteCriteria(id);
    }
    @PutMapping("modifierCriteria")
    void updateCriteria(@RequestBody Criteria criteria){
    critaireResource.updateCriteria(criteria);
    }
}
