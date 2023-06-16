package com.example.darna.service.serviceInterfaces;

import com.example.darna.dao.entities.Reclamation;

import java.util.List;
import java.util.Optional;

public interface ReclamationResource {
    Reclamation addReclamation (Reclamation reclamation);
    Reclamation updateReclamation (Reclamation reclamation);
    List<Reclamation> getAllReclamation();
    Optional<Reclamation> getReclamationById(int id);
    void deleteReclamation(int id);
    void deleteReclamation(Reclamation reclamation);
}
