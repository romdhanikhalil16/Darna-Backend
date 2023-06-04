package com.example.darna.DAO.Repo;

import com.example.darna.DAO.entities.Article;
import com.example.darna.DAO.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepo extends CrudRepository<Article,Integer> {
}
