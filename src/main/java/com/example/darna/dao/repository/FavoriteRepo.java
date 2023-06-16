package com.example.darna.dao.repository;

import com.example.darna.dao.entities.Favorite;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface FavoriteRepo extends CrudRepository<Favorite,Integer> {
    Optional<Favorite> findByPostIdAndUserId(Long postId, Long userId);
    @Query("select a from Favorite a")
    List<Favorite> getAllFavorites();
    Optional<Favorite> findFavoriteById(int id);
    void deleteFavoriteById(int id);



}
