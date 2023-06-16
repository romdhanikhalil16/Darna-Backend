package com.example.darna.service.serviceInterfaces;

import com.example.darna.dao.entities.Commentaire;

import java.util.List;

public interface CommentaireResource {
    Commentaire addCommentaire (Commentaire commentaire);

    Commentaire addCommentToPost(int postId, Commentaire comment);
    Commentaire updateCommentaire (Commentaire commentaire);
    List<Commentaire> getAllCommentaire();
    Commentaire getCommentaireById(int id);
    void deleteCommentaire(int id);
    void deleteCommentaire(Commentaire commentaire);
     Commentaire getCommentsForArticle(int postId);
}
