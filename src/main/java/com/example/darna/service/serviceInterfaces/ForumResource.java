package com.example.darna.service.serviceInterfaces;

import com.example.darna.dao.entities.Adresse;
import com.example.darna.dao.entities.Forum;

import java.util.List;

public interface ForumResource {
    Forum addForum (Forum forum);
    Forum updateForum (Forum forum);
    List<Forum> getAllForum();
    Forum addCommentToForum(int commentId, Forum forum);
    Forum getForumById(int id);
    void deleteForum(int id);
    void deleteForum(Forum forum);
}
