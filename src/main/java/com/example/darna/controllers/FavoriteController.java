package com.example.darna.controllers;

import com.example.darna.dao.entities.Favorite;
import com.example.darna.service.FavoriteServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/favorites")
public class FavoriteController {
    private FavoriteServiceImpl favoriteService;


    @PostMapping
    public Favorite addFavorite(@RequestBody Favorite favorite) {
        return favoriteService.addFavorite(favorite);
    }

    @PutMapping
    public Favorite updateFavorite(@RequestBody Favorite favorite) {
        return favoriteService.updateFavorite(favorite);
    }

    @PostMapping("/favorite/{postId}")
    public Favorite addFavoriteToPost(@PathVariable int postId, @RequestBody Favorite favorite) {
        return favoriteService.addFavoriteToPost(postId, favorite);
    }

    @GetMapping
    public List<Favorite> getAllFavorites() {
        return favoriteService.getAllFavorite();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Favorite> getFavoriteById(@PathVariable int id) {
        Optional<Favorite> optionalFavorite = favoriteService.getFavoriteById(id);
        return optionalFavorite.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavoriteById(@PathVariable int id) {
        favoriteService.deleteFavorite(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteFavorite(@RequestBody Favorite favorite) {
        favoriteService.deleteFavorite(favorite);
        return ResponseEntity.noContent().build();
    }
}
