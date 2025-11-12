package com.example.foyer.services;

import com.example.foyer.entity.Bloc;
import com.example.foyer.entity.Etudiant;
import com.example.foyer.entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFoyerService  {


    public Foyer addFoyer(Foyer foyer);
    public Foyer updateFoyer(Foyer foyer);

    public Foyer getFoyerById (int idFoyer);

    void deleteFoyer(int idFoyer);

    public List<Foyer> getAllFoyers();

}
