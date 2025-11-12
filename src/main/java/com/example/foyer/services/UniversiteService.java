package com.example.foyer.services;

import com.example.foyer.entity.Bloc;
import com.example.foyer.entity.Foyer;
import com.example.foyer.entity.Universite;
import com.example.foyer.repositories.FoyerRepository;
import com.example.foyer.repositories.ReservationRepository;
import com.example.foyer.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {
    @Autowired
    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Long idUniversite) {
universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite getUniversiteById(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public List<Universite> getAllUniversites() {
        return (List<Universite>) universiteRepository.findAll();
    }

    @Override
    public Universite getUniversiteByName(String universiteName) {
        return universiteRepository.findByNomUniversite(universiteName);
    }

    @Override
    public Universite affecterFoyerToUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite affecterFoyerToUniversite(Long idUniversite, Foyer foyer) {
        Foyer foyer1=foyerRepository.save(foyer);
        Universite universite=universiteRepository.findById(idUniversite).get();
        universite.setFoyer(foyer1);
        return universiteRepository.save(universite);
    }


}
