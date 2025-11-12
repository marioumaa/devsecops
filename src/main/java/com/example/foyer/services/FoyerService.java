package com.example.foyer.services;

import com.example.foyer.entity.Bloc;
import com.example.foyer.entity.Foyer;
import com.example.foyer.repositories.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {

    @Autowired
     FoyerRepository foyerRepository;
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(int idFoyer) {
foyerRepository.deleteById(idFoyer);
    }

    @Override
    public Foyer getFoyerById(int idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public List<Foyer> getAllFoyers() {
        return (List<Foyer>) foyerRepository.findAll();
    }


}
