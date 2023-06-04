package com.example.darna.DAO.Repo;

import com.example.darna.DAO.entities.Adresse;
import com.example.darna.DAO.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdresseRepo extends CrudRepository<Adresse,Integer> {
    @Query("select a from Adresse a")
    List<Adresse> selectAdresse();
    Adresse findByIdAndAdresse_id(int id);

}
