package com.example.darna.dao.repository;

import com.example.darna.dao.entities.Article;
import com.example.darna.dao.entities.Commentaire;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentaireRepo extends CrudRepository<Commentaire,Integer> {
    @Query("select a from Commentaire a")
    List<Commentaire> getAllCommentaires();
    Commentaire findCommentaireById(int id);
    void deleteCommentaireById(int id);
}
