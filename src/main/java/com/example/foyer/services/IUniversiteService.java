package com.example.foyer.services;

import com.example.foyer.entity.Bloc;
import com.example.foyer.entity.Foyer;
import com.example.foyer.entity.Universite;

import java.util.List;

public interface IUniversiteService {


    public Universite addUniversite(Universite universite);
    public Universite updateUniversite(Universite universite);
    public void deleteUniversite(Long idUniversite);
    public Universite getUniversiteById (Long idUniversite);
    public List<Universite> getAllUniversites();
    public Universite getUniversiteByName(String universiteName);
    public  Universite affecterFoyerToUniversite(Universite universite);
     public Universite affecterFoyerToUniversite( Long idUniversite, Foyer foyer) ;
}
