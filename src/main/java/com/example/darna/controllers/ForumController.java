package com.example.darna.controllers;

import com.example.darna.dao.entities.Forum;
import com.example.darna.service.serviceInterfaces.ForumResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/forum")
public class ForumController {
    @Autowired
    ForumResource forumResource;
    @PostMapping("addForum")
    Forum ajouterForum(@RequestBody Forum forum) {
        return forumResource.addForum(forum);
    }
    @GetMapping("GetForum")
    public Forum ForumParId(@RequestParam int id) {
        return forumResource.getForumById(id);
    }
    @GetMapping("GetAll")
    public List<Forum> ForumList() {
        return forumResource.getAllForum();
    }
    //thabeto fiha
    @DeleteMapping("DeleteForum")
    void deleteCommentaire(@RequestBody Forum forum){
       forumResource.deleteForum(forum);
    }
    @DeleteMapping("DeletForumId")
    void deleteForumId(@RequestParam int id){
        forumResource.deleteForum(id);
    }
    @PutMapping("modifierForum")
    void updateForum(@RequestBody Forum forum){
      forumResource.updateForum(forum);
    }
}
