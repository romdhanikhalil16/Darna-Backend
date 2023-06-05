package com.example.darna.service;

import com.example.darna.dao.entities.Criteria;
import com.example.darna.dao.repository.CriteriaRepo;
import com.example.darna.service.serviceInterfaces.CritaireResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CriteriaServiceImpl implements CritaireResource {
    @Autowired
    CriteriaRepo criteriaRepo;
    @Override
    public Criteria addCriteria(Criteria criteria) {
        return criteriaRepo.save(criteria);
    }

    @Override
    public Criteria updateCriteria(Criteria criteria) {
        return criteriaRepo.save(criteria);
    }

    @Override
    public List<Criteria> getAllCriteria() {
        return criteriaRepo.getAllCriteriats();
    }

    @Override
    public Criteria getCriteriaById(int id) {
        return criteriaRepo.findCriteriaById(id);
    }

    @Override
    public void deleteCriteria(int id) {
        criteriaRepo.deleteCriteriaById(id);
    }

    @Override
    public void deleteCriteria(Criteria criteria) {
        criteriaRepo.delete(criteria);
    }
}
