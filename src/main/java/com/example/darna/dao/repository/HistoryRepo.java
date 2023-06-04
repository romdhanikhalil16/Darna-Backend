package com.example.darna.dao.repository;

import com.example.darna.dao.entities.History;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepo extends CrudRepository<History,Integer> {
}
