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
    AdresseRepo ra;
    @Override
    public Adresse addAdress(Adresse adresse) {
        return ra.save(adresse);
    }

    @Override
    public Adresse updateAdresse(Adresse adresse) {
        return ra.save(adresse);
    }

    @Override
    public List<Adresse> getAllAdresse() {
        return ra.selectAdresse();
    }

    @Override
    public Adresse getAdresseById(int id) {
        return ra.findByIdAndAdresse_id(id);
    }

    @Override
    public void deleteAdresse(int id) {
         ra.deleteById(id);
    }

    @Override
    public void deleteAdresse(Adresse adresse) {
        ra.delete(adresse);
    }
}
