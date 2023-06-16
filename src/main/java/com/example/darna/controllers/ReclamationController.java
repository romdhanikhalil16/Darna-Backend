package com.example.darna.controllers;

import com.example.darna.dao.entities.Reclamation;
import com.example.darna.service.ReclamationServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reclamations")
public class ReclamationController {
    private  ReclamationServiceImpl reclamationService;


    @PostMapping
    public Reclamation addReclamation(@RequestBody Reclamation reclamation) {
        return reclamationService.addReclamation(reclamation);
    }

    @PutMapping
    public Reclamation updateReclamation(@RequestBody Reclamation reclamation) {
        return reclamationService.updateReclamation(reclamation);
    }

    @GetMapping
    public List<Reclamation> getAllReclamations() {
        return reclamationService.getAllReclamation();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reclamation> getReclamationById(@PathVariable int id) {
        Optional<Reclamation> optionalReclamation = reclamationService.getReclamationById(id);
        return optionalReclamation.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReclamationById(@PathVariable int id) {
        reclamationService.deleteReclamation(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteReclamation(@RequestBody Reclamation reclamation) {
        reclamationService.deleteReclamation(reclamation);
        return ResponseEntity.noContent().build();
    }
}
