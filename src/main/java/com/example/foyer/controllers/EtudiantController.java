package com.example.foyer.controllers;

import com.example.foyer.entity.Etudiant;
import com.example.foyer.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/etudiants")
public class EtudiantController {
    @Autowired
    IEtudiantService etudiantService;
@GetMapping("/getall")
public List<Etudiant> getAllEtudiant(){
    return etudiantService.getAllEtudiants();
}
@GetMapping("/getbyid/{id}")

public Etudiant getEtudiantById(@PathVariable("id") long id){
    return etudiantService.getEtudiantById(id);
}
    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant){
    return etudiantService.addEtudiant(etudiant);
    }
    @PutMapping("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
    return etudiantService.updateEtudiant(etudiant);
    }
    @DeleteMapping("/delete/{id}")

    public void deleteEtudiant(@PathVariable("id") long id){
    etudiantService.deleteEtudiant(id);
    }

}
