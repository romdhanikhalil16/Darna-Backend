package com.example.darna.service;


import com.example.darna.dao.entities.Article;
import com.example.darna.dao.repository.ArticleRepo;
import com.example.darna.service.serviceInterfaces.ArticleResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleResource{
    @Autowired
    ArticleRepo articleRepo;
    @Override
    public Article addArticle(Article article) {
        return articleRepo.save(article);
    }

    @Override
    public Article updateArticle(Article article) {
        return articleRepo.save(article);
    }

    @Override
    public List<Article> getAllArticle() {
        return articleRepo.getAllArticles();
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepo.getAllArticles();
    }

    @Override
    public Article getArticleById(int id) {
        return articleRepo.findArticleById(id);
    }

    @Override
    public void deleteArticle(int id) {
        articleRepo.deleteArticleById(id);
    }

    @Override
    public void deleteArticle(Article article) {
        articleRepo.delete(article);
    }
}
