package com.example.darna.service.serviceInterfaces;

import com.example.darna.dao.entities.Adresse;
import com.example.darna.dao.entities.Criteria;

import java.util.List;

public interface CritaireResource {
    Criteria addCriteria (Criteria criteria);
    Criteria updateCriteria (Criteria criteria);
    List<Criteria> getAllCriteria();
    Criteria getCriteriaById(int id);
    void deleteCriteria(int id);
    void deleteCriteria(Criteria criteria);
}
