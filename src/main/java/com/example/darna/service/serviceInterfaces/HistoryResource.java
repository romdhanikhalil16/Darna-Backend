package com.example.darna.service.serviceInterfaces;

import com.example.darna.dao.entities.Adresse;
import com.example.darna.dao.entities.History;

import java.util.List;

public interface HistoryResource {
    History addHistory (History history);
    History updateHistory (History history);
    List<History> getAllHistory();
    History getHistoryById(int id);
    void deleteHistory(int id);
    void deleteHistory(History history);
}
