package com.example.darna.dao.repository;

import com.example.darna.dao.entities.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepo extends CrudRepository<Article,Integer> {
    @Query("select a from Article a")
    List<Article>getAllArticles();
    Article findArticleById(int id);
    void deleteArticleById(int id);
}
