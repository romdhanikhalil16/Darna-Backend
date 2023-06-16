package com.example.darna.service;

import com.example.darna.dao.entities.Article;
import com.example.darna.dao.entities.Commentaire;
import com.example.darna.dao.repository.CommentaireRepo;
import com.example.darna.service.serviceInterfaces.CommentaireResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentaireServiceImpl implements CommentaireResource {
    @Autowired
    CommentaireRepo commentaireRepo;

    @Autowired
    ArticleServiceImpl articleService;
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
    public Commentaire addCommentToPost(int postId, Commentaire comment) {
        Optional<Article> optionalArticle = articleService.getArticleById(postId);
        if (optionalArticle.isPresent()) {
            Article post = optionalArticle.get();
            comment.setArticle(post);
            return commentaireRepo.save(comment);
        } else {
            throw new IllegalArgumentException("Post not found");
        }
    }

   @Override
   public Commentaire getCommentsForArticle(int postId) {
        return commentaireRepo.findCommentaireByArticle(postId);
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
