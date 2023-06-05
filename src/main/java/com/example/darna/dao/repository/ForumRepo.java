package com.example.darna.dao.repository;

import com.example.darna.dao.entities.Commentaire;
import com.example.darna.dao.entities.Forum;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ForumRepo extends CrudRepository<Forum,Integer> {
    @Query("select a from Forum a")
    List<Forum> getAllForums();
    Forum findForumById(int id);
    void deleteForumById(int id);
}
