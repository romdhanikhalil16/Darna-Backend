package com.example.darna.dao.repository;

import com.example.darna.dao.entities.Criteria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriteriaRepo extends CrudRepository<Criteria,Integer> {
}
