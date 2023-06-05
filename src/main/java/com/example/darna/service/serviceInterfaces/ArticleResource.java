package com.example.darna.service.serviceInterfaces;

import com.example.darna.dao.entities.Adresse;
import com.example.darna.dao.entities.Article;

import java.util.List;

public interface ArticleResource {
    Article addArticle (Article article);
    Article updateArticle (Article article);
    List<Article> getAllArticle();

    List<Article> getAllArticles();

    Article getArticleById(int id);
    void deleteArticle(int id);
    void deleteArticle(Article article);
}
