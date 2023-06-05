package com.example.darna.controllers;

import com.example.darna.dao.entities.Adresse;
import com.example.darna.service.serviceInterfaces.AdresseResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adresse")
public class AdresseController {
    @Autowired
    AdresseResource adresseResource;

    @PostMapping("addAdress")
    Adresse ajouterAdresse(@RequestBody Adresse adresse) {
        return adresseResource.addAdresse(adresse);
    }
    @GetMapping("GetAdress")
    public Adresse AdresseParId(@RequestParam int id) {
        return adresseResource.getAdresseById(id);
    }
    @GetMapping("GetAll")
    public List<Adresse> adresseList() {
        return adresseResource.getAllAdresse();
    }
    //thabeto fiha
    @DeleteMapping("DeleteAdress")
    void deleteAdresse(@RequestBody Adresse adresse){
        adresseResource.deleteAdresse(adresse);
    }
    @DeleteMapping("DeletAdresseId")
    void deleteAdresseId(@RequestParam int id){
        adresseResource.deleteAdresse(id);
    }
    @PutMapping("modifierAdress")
    void updateAdresse(@RequestBody Adresse adresse){
        adresseResource.updateAdresse(adresse);
    }

}
