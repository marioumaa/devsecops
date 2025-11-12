package com.example.foyer.services;

import com.example.foyer.entity.Bloc;
import com.example.foyer.entity.Chambre;
import com.example.foyer.entity.TypeChambre;

import java.util.List;

public interface IChambreService {


    public Chambre addChambre(Chambre chambre);
    public Chambre updateChambre(Chambre chambre);
    public void deleteChambre(Long idChambre);
    public Chambre getChambreById (Long idChambre);
    public List<Chambre> getAllChambres();
    public List<Chambre> getChambreByType(TypeChambre type );
}
