package com.example.foyer.services;

import com.example.foyer.entity.Chambre;
import com.example.foyer.entity.TypeChambre;
import com.example.foyer.repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {

@Autowired
    ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long idChambre) {
           chambreRepository.deleteById(idChambre);

    }

    @Override
    public Chambre getChambreById(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public List<Chambre> getAllChambres() {
        return (List<Chambre>) chambreRepository.findAll();
    }

    @Override
    public List<Chambre> getChambreByType(TypeChambre type) {
        return (List<Chambre>) chambreRepository.findByTypeCLike(type);
    }


}
