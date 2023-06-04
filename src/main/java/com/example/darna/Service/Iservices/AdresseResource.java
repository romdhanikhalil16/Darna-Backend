package com.example.darna.Service.Iservices;

import com.example.darna.DAO.entities.Adresse;

import java.util.List;

public interface AdresseResource {
    Adresse addAdress (Adresse adresse);
    Adresse updateAdresse (Adresse adresse);
    List<Adresse> getAllAdresse();
    Adresse getAdresseById(int id);
    void deleteAdresse(int id);
    void deleteAdresse(Adresse adresse);
}
