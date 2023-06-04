package com.example.darna.dao.repository;

import com.example.darna.dao.entities.Commentaire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireRepo extends CrudRepository<Commentaire,Integer> {
}
