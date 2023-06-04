package com.example.darna.DAO.Repo;

import com.example.darna.DAO.entities.Reclamation;
import com.example.darna.DAO.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface ReclamationRepo extends CrudRepository<Reclamation,Integer> {
}
