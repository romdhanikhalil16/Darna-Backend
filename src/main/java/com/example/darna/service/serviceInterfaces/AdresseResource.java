package com.example.darna.service.serviceInterfaces;

import com.example.darna.dao.entities.Adresse;

import java.util.List;

public interface AdresseResource {
    Adresse addAdress (Adresse adresse);
    Adresse updateAdresse (Adresse adresse);
    List<Adresse> getAllAdresse();
    Adresse getAdresseById(int id);
    void deleteAdresse(int id);
    void deleteAdresse(Adresse adresse);
}
