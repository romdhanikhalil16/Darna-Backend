package com.example.darna.dao.repository;

import com.example.darna.dao.entities.Commentaire;
import com.example.darna.dao.entities.Criteria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CriteriaRepo extends CrudRepository<Criteria,Integer> {
    @Query("select a from Criteria a")
    List<Criteria> getAllCriteriats();
    Criteria findCriteriaById(int id);
    void deleteCriteriaById(int id);
}
