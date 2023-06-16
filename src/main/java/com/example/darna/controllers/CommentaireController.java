package com.example.darna.controllers;

import com.example.darna.dao.entities.Article;
import com.example.darna.dao.entities.Commentaire;
import com.example.darna.service.serviceInterfaces.ArticleResource;
import com.example.darna.service.serviceInterfaces.CommentaireResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commentaire")
public class CommentaireController {
    @Autowired
    CommentaireResource commentaireResource;
    @PostMapping("addCommentaire")
    Commentaire ajouterCommentaire(@RequestBody Commentaire commentaire) {
       return commentaireResource.addCommentaire(commentaire);
    }
    @GetMapping("GetCommentaire")
    public Commentaire CommentaireParId(@RequestParam int id) {
        return commentaireResource.getCommentaireById(id);
    }
    @GetMapping("GetAll")
    public List<Commentaire> CommentaireList() {
        return commentaireResource.getAllCommentaire();
    }
    //thabeto fiha
    @DeleteMapping("DeleteCommentaire")
    void deleteCommentaire(@RequestBody Commentaire commentaire){
        commentaireResource.deleteCommentaire(commentaire);
    }
    @DeleteMapping("DeletCommentaireId")
    void deleteCommentaireId(@RequestParam int id){
        commentaireResource.deleteCommentaire(id);
    }
    @PutMapping("modifierCommentaire")
    void updateCommentaire(@RequestBody Commentaire commentaire){
       commentaireResource.updateCommentaire(commentaire);
    }
}
