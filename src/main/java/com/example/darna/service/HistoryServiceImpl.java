package com.example.darna.service;

import com.example.darna.dao.entities.History;
import com.example.darna.dao.repository.HistoryRepo;
import com.example.darna.service.serviceInterfaces.HistoryResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryResource {
    @Autowired
    HistoryRepo historyRepo;
    @Override
    public History addHistory(History history) {
        return historyRepo.save(history);
    }

    @Override
    public History updateHistory(History history) {
        return historyRepo.save(history);
    }

    @Override
    public List<History> getAllHistory() {
        return historyRepo.getAllHistories();
    }

    @Override
    public History getHistoryById(int id) {
        return historyRepo.findHistoryById(id);
    }

    @Override
    public void deleteHistory(int id) {
        historyRepo.deleteHistoryById(id);
    }

    @Override
    public void deleteHistory(History history) {
        historyRepo.delete(history);
    }
}
