package com.example.darna.controllers;

import com.example.darna.dao.entities.Commentaire;
import com.example.darna.dao.entities.Favorite;
import com.example.darna.dao.entities.Forum;
import com.example.darna.service.ForumServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/forums")
public class ForumController {
    private ForumServiceImpl forumService;

    @PostMapping
    public Forum addForum(@RequestBody Forum forum) {
        return forumService.addForum(forum);
    }

    @PutMapping
    public Forum updateForum(@RequestBody Forum forum) {
        return forumService.updateForum(forum);
    }

    @GetMapping
    public List<Forum> getAllForums() {
        return forumService.getAllForum();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Forum> getForumById(@PathVariable int id) {
        Forum forum = forumService.getForumById(id);
        if (forum != null) {
            return ResponseEntity.ok(forum);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteForumById(@PathVariable int id) {
        Forum forum = forumService.getForumById(id);
        if (forum != null) {
            forumService.deleteForum(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/forum/{commentId}")
    public Forum addCommentToForum(@PathVariable int commentd, @RequestBody Forum forum) {
        return forumService.addCommentToForum(commentd,forum);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteForum(@RequestBody Forum forum) {
        forumService.deleteForum(forum);
        return ResponseEntity.noContent().build();
    }
}
