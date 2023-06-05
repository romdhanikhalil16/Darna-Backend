package com.example.darna.service;

import com.example.darna.dao.entities.Commentaire;
import com.example.darna.dao.repository.CommentaireRepo;
import com.example.darna.service.serviceInterfaces.CommentaireResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaireServiceImpl implements CommentaireResource {
    @Autowired
    CommentaireRepo commentaireRepo;
    @Override
    public Commentaire addCommentaire(Commentaire commentaire) {
        return commentaireRepo.save(commentaire);
    }

    @Override
    public Commentaire updateCommentaire(Commentaire commentaire) {
        return commentaireRepo.save(commentaire);
    }

    @Override
    public List<Commentaire> getAllCommentaire() {
        return commentaireRepo.getAllCommentaires();
    }

    @Override
    public Commentaire getCommentaireById(int id) {
        return commentaireRepo.findCommentaireById(id);
    }

    @Override
    public void deleteCommentaire(int id) {
        commentaireRepo.deleteCommentaireById(id);
    }

    @Override
    public void deleteCommentaire(Commentaire commentaire) {
        commentaireRepo.delete(commentaire);
    }
}
