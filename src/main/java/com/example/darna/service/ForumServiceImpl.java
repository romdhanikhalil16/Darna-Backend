package com.example.darna.service;

import com.example.darna.dao.entities.Article;
import com.example.darna.dao.entities.Commentaire;
import com.example.darna.dao.entities.Forum;
import com.example.darna.dao.repository.CommentaireRepo;
import com.example.darna.dao.repository.ForumRepo;
import com.example.darna.service.serviceInterfaces.ForumResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ForumServiceImpl implements ForumResource {
    final ForumRepo forumRepo;

    @Autowired
    ForumServiceImpl forumService;
    @Autowired
    CommentaireRepo commentaireRepo;

    @Autowired
    CommentaireServiceImpl commentaireService;

    public ForumServiceImpl(ForumRepo forumRepo) {
        this.forumRepo = forumRepo;
    }

    @Override
    public Forum addForum(Forum forum) {
        return forumRepo.save(forum);
    }

    @Override
    public Forum updateForum(Forum forum) {
        return forumRepo.save(forum);
    }

    @Override
    public Forum addCommentToForum(int commentId, Forum forum) {
        Optional<Commentaire> optionalCommentaire = Optional.ofNullable(commentaireService.getCommentaireById(commentId));
        if (optionalCommentaire.isPresent()) {
            Commentaire commentaire = optionalCommentaire.get();
            forum.setCommentaires((Set<Commentaire>) commentaire);
            return forumRepo.save(forum);
        } else {
            throw new IllegalArgumentException("Post not found");
        }
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
