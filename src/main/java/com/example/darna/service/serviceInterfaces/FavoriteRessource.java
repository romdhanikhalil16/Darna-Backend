package com.example.darna.service.serviceInterfaces;

import com.example.darna.dao.entities.Favorite;
import com.example.darna.dao.entities.Reclamation;

import java.util.List;
import java.util.Optional;

public interface FavoriteRessource {
    Favorite addFavorite (Favorite favorite);
    Favorite updateFavorite (Favorite favorite);
    Favorite addFavoriteToPost(int postId, Favorite favorite);
    List<Favorite> getAllFavorite();
    Optional<Favorite> getFavoriteById(int id);
    void deleteFavorite(int id);
    void deleteFavorite(Favorite favorite);
}
