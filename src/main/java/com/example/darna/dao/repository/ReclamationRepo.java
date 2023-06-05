package com.example.darna.dao.repository;

import com.example.darna.dao.entities.Commentaire;
import com.example.darna.dao.entities.Reclamation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReclamationRepo extends CrudRepository<Reclamation,Integer> {
    @Query("select a from Reclamation a")
    List<Reclamation> getAllReclamations();
    Reclamation findReclamationById(int id);
    void deleteReclamationById(int id);
}
