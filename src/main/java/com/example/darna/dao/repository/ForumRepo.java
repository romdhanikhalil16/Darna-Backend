package com.example.darna.dao.repository;

import com.example.darna.dao.entities.Forum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForumRepo extends CrudRepository<Forum,Integer> {
}
