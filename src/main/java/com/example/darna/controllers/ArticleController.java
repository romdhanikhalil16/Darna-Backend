package com.example.darna.controllers;

import com.example.darna.dao.entities.Adresse;
import com.example.darna.dao.entities.Article;
import com.example.darna.service.AdresseServiceImpl;
import com.example.darna.service.serviceInterfaces.ArticleResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ArticleResource articleResource;
    @PostMapping("addArticle")
    Article ajouterArticle(@RequestBody Article article) {
        return articleResource.addArticle(article);
    }
    @GetMapping("GetArticle")
    public Article ArticleParId(@RequestParam int id) {
        return articleResource.getArticleById(id);
    }
    @GetMapping("GetAll")
    public List<Article> ArticlleList() {
        return articleResource.getAllArticle();
    }
    //thabeto fiha
    @DeleteMapping("DeleteArticle")
    void deleteArticle(@RequestBody Article article){
        articleResource.deleteArticle(article);
    }
    @DeleteMapping("DeletArticleId")
    void deleteArticleId(@RequestParam int id){
        articleResource.deleteArticle(id);
    }
    @PutMapping("modifierArticle")
    void updateArticle(@RequestBody Article article){
        articleResource.updateArticle(article);
    }

}
