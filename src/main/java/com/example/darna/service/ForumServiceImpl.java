package com.example.darna.service;

import com.example.darna.dao.entities.Forum;
import com.example.darna.dao.repository.ForumRepo;
import com.example.darna.service.serviceInterfaces.ForumResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumServiceImpl implements ForumResource {
    @Autowired
    ForumRepo forumRepo;
    @Override
    public Forum addForum(Forum forum) {
        return forumRepo.save(forum);
    }

    @Override
    public Forum updateForum(Forum forum) {
        return forumRepo.save(forum);
    }

    @Override
    public List<Forum> getAllForum() {
        return forumRepo.getAllForums();
    }

    @Override
    public Forum getForumById(int id) {
        return forumRepo.findForumById(id);
    }

    @Override
    public void deleteForum(int id) {
        forumRepo.deleteForumById(id);
    }

    @Override
    public void deleteForum(Forum forum) {
        forumRepo.delete(forum);
    }
}
