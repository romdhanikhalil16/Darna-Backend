package com.example.darna.service.serviceInterfaces;

import com.example.darna.dao.entities.Adresse;
import com.example.darna.dao.entities.Reclamation;

import java.util.List;

public interface ReclamationResource {
    Reclamation addReclamation (Reclamation reclamation);
    Reclamation updateReclamation (Reclamation reclamation);
    List<Reclamation> getAllReclamation();
    Reclamation getReclamationById(int id);
    void deleteReclamation(int id);
    void deleteReclamation(Reclamation reclamation);
}
