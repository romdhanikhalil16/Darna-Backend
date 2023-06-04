package com.example.darna.dao.repository;

import com.example.darna.dao.entities.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdresseRepo extends JpaRepository<Adresse,Integer> {

    Adresse findAdresseById(int id);
    @Query("select a from Adresse a")
    List<Adresse> getAllAdresses();


}
