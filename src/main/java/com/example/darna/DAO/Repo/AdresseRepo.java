package com.example.darna.DAO.Repo;

import com.example.darna.DAO.entities.Adresse;
import com.example.darna.DAO.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseRepo extends CrudRepository<Adresse,Integer> {
}
