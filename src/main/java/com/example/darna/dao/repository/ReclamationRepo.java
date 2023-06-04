package com.example.darna.dao.repository;

import com.example.darna.dao.entities.Reclamation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationRepo extends CrudRepository<Reclamation,Integer> {
}
