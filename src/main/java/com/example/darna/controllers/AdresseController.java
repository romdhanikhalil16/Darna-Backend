package com.example.darna.controllers;

import com.example.darna.DAO.entities.Adresse;
import com.example.darna.Service.Iservices.AdresseResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adresse")
public class AdresseController {
    @Autowired
    AdresseResource ar;

    @PostMapping("ajouterAdress")
    Adresse ajouterAdresse(@RequestBody Adresse adresse) {
        return ar.addAdress(adresse);
    }
    @GetMapping("GetAdresse")
    public Adresse AdresseParId(@RequestParam int id) {
        return ar.getAdresseById(id);
    }
    @GetMapping("GetAll")
    public List<Adresse> adresseList() {
        return ar.getAllAdresse();
    }
    //thabeto fiha
    @DeleteMapping("DeletAdresse")
    void deleteAdresse(@RequestBody Adresse adresse){
        ar.deleteAdresse(adresse);
    }
    @DeleteMapping("DeletAdresseId")
    void deleteAdresseId(@RequestParam int id){
        ar.deleteAdresse(id);
    }
    @PutMapping("modifierAdress")
    void updateAdresse(@RequestBody Adresse adresse){
        ar.updateAdresse(adresse);
    }

}
