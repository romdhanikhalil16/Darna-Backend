package com.example.darna.dao.repository;

import com.example.darna.dao.entities.Commentaire;
import com.example.darna.dao.entities.History;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryRepo extends CrudRepository<History,Integer> {
    @Query("select a from History a")
    List<History> getAllHistories();
    History findHistoryById(int id);
    void deleteHistoryById(int id);
}
