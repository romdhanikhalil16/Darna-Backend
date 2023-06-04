package com.example.darna.Service;

import com.example.darna.DAO.Repo.AdresseRepo;
import com.example.darna.DAO.entities.Adresse;
import com.example.darna.Service.Iservices.AdresseResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdresseServiceImpl implements AdresseResource {
    @Autowired
    AdresseRepo adresseRepo;
    @Override
    public Adresse addAdress(Adresse adresse) {
        return adresseRepo.save(adresse);
    }

    @Override
    public Adresse updateAdresse(Adresse adresse) {
        return adresseRepo.save(adresse);
    }

    @Override
    public List<Adresse> getAllAdresse() {
        return adresseRepo.getAllAdresses();
    }

    @Override
    public Adresse getAdresseById(int id) {
        return adresseRepo.findAdresseById(id);
    }

    @Override
    public void deleteAdresse(int id) {
         adresseRepo.deleteById(id);
    }

    @Override
    public void deleteAdresse(Adresse adresse) {
        adresseRepo.delete(adresse);
    }
}
