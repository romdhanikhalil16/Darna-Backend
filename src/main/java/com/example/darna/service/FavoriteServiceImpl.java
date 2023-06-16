package com.example.darna.service;

import com.example.darna.dao.entities.Article;
import com.example.darna.dao.entities.Favorite;
import com.example.darna.dao.repository.FavoriteRepo;
import com.example.darna.service.serviceInterfaces.FavoriteRessource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class FavoriteServiceImpl implements FavoriteRessource {

    @Autowired
    FavoriteRepo favoriteRepo;

    @Autowired
    ArticleServiceImpl articleService;

    @Override
    public Favorite addFavorite(Favorite favorite) {
         return favoriteRepo.save(favorite);
    }

    @Override
    public Favorite updateFavorite(Favorite favorite) {
        return  favoriteRepo.save(favorite);
    }

    @Override
    public Favorite addFavoriteToPost(int postId, Favorite favorite) {
        Optional<Article> optionalArticle = articleService.getArticleById(postId);
        if (optionalArticle.isPresent()) {
            Article article = optionalArticle.get();
            favorite.setArticle((Set<Article>) article);
            return favoriteRepo.save(favorite);
        } else {
            throw new IllegalArgumentException("Post not found");
        }
    }
    @Override
    public List<Favorite> getAllFavorite() {
        return favoriteRepo.getAllFavorites();
    }

    @Override
    public Optional<Favorite> getFavoriteById(int id) {
        return favoriteRepo.findFavoriteById(id);
    }

    @Override
    public void deleteFavorite(int id) {
        favoriteRepo.deleteFavoriteById(id);
    }

    @Override
    public void deleteFavorite(Favorite favorite) {
        favoriteRepo.delete(favorite);
    }
}
