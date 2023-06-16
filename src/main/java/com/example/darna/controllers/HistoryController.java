package com.example.darna.controllers;


import com.example.darna.dao.entities.History;
import com.example.darna.service.serviceInterfaces.HistoryResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/history")
public class HistoryController {
    @Autowired
    HistoryResource historyResource;
    @PostMapping("addHistory")
    History ajouterHistory(@RequestBody History history) {
        return historyResource.addHistory(history);
    }
    @GetMapping("GetHistory")
    public History HistoryParId(@RequestParam int id) {
        return historyResource.getHistoryById(id);
    }
    @GetMapping("GetAll")
    public List<History> HistoryList() {
        return historyResource.getAllHistory();
    }
    //thabeto fiha
    @DeleteMapping("DeleteHistory")
    void deleteHistory(@RequestBody History history){
        historyResource.deleteHistory(history);
    }
    @DeleteMapping("DeletHistoryId")
    void deleteHistoryId(@RequestParam int id){
        historyResource.deleteHistory(id);
    }
    @PutMapping("modifierHistory")
    void updateHistory(@RequestBody History history){
         historyResource.updateHistory(history);
    }
}
