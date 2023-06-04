package com.example.darna.DAO.Repo;

import com.example.darna.DAO.entities.History;
import com.example.darna.DAO.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepo extends CrudRepository<History,Integer> {
}
