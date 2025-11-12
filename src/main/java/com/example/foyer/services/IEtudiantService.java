package com.example.foyer.services;

import com.example.foyer.entity.Chambre;
import com.example.foyer.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {


    public Etudiant addEtudiant(Etudiant etudiant);
    public Etudiant updateEtudiant(Etudiant etudiant);
    public void deleteEtudiant(Long idEtudiant);
    public Etudiant getEtudiantById (Long idEtudiant);
    public List<Etudiant> getAllEtudiants();
}
