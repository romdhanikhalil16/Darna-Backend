package com.example.darna.DAO.Repo;

import com.example.darna.DAO.entities.Forum;
import com.example.darna.DAO.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface ForumRepo extends CrudRepository<Forum,Integer> {
}
