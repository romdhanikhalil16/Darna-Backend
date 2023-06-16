package com.example.darna.controllers;

import com.example.darna.dao.entities.Commentaire;
import com.example.darna.service.CommentaireServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commentaires")
public class CommentaireController {
    private CommentaireServiceImpl commentaireService;

    @PostMapping
    public Commentaire addCommentaire(@RequestBody Commentaire commentaire) {
        return commentaireService.addCommentaire(commentaire);
    }

    @PostMapping("/commentaire/{postId}")
    public Commentaire addCommentToPost(@PathVariable int postId, @RequestBody Commentaire comment) {
        return commentaireService.addCommentToPost(postId, comment);
    }
    @PutMapping
    public Commentaire updateCommentaire(@RequestBody Commentaire commentaire) {
        return commentaireService.updateCommentaire(commentaire);
    }

    @GetMapping("/comments/{articleId}")
    public Commentaire getCommentsForArticle(@PathVariable int postId){
        return commentaireService.getCommentsForArticle(postId);
    }
    @GetMapping
    public List<Commentaire> getAllCommentaires() {
        return commentaireService.getAllCommentaire();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Commentaire> getCommentaireById(@PathVariable int id) {
        Commentaire commentaire = commentaireService.getCommentaireById(id);
        if (commentaire != null) {
            return ResponseEntity.ok(commentaire);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCommentaireById(@PathVariable int id) {
        Commentaire commentaire = commentaireService.getCommentaireById(id);
        if (commentaire != null) {
            commentaireService.deleteCommentaire(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteCommentaire(@RequestBody Commentaire commentaire) {
        commentaireService.deleteCommentaire(commentaire);
        return ResponseEntity.noContent().build();
    }
}