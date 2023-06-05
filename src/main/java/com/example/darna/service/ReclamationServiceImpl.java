package com.example.darna.service;

import com.example.darna.dao.entities.Reclamation;
import com.example.darna.dao.repository.ReclamationRepo;
import com.example.darna.service.serviceInterfaces.ReclamationResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReclamationServiceImpl implements ReclamationResource {
    @Autowired
    ReclamationRepo reclamationRepo;
    @Override
    public Reclamation addReclamation(Reclamation reclamation) {
        return reclamationRepo.save(reclamation);
    }

    @Override
    public Reclamation updateReclamation(Reclamation reclamation) {
        return reclamationRepo.save(reclamation);
    }

    @Override
    public List<Reclamation> getAllReclamation() {
        return reclamationRepo.getAllReclamations();
    }

    @Override
    public Reclamation getReclamationById(int id) {
        return reclamationRepo.findReclamationById(id);
    }

    @Override
    public void deleteReclamation(int id) {
        reclamationRepo.deleteReclamationById(id);
    }

    @Override
    public void deleteReclamation(Reclamation reclamation) {
        reclamationRepo.delete(reclamation);
    }
}
