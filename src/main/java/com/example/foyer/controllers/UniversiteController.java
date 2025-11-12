package com.example.foyer.controllers;

import com.example.foyer.entity.Foyer;
import com.example.foyer.entity.Universite;
import com.example.foyer.services.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/universities")
public class UniversiteController {


    @Autowired
    IUniversiteService universiteService;
    @PostMapping("/add")
    public Universite addingUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);

    }
    @DeleteMapping("delete/{id}")
    public void removingUniversite(@PathVariable("id") long idUniversite) {
        universiteService.deleteUniversite(idUniversite);
    }

    @GetMapping("getAll")
    public List<Universite> getAllUniversite() {
        return universiteService.getAllUniversites();
    }
    @GetMapping("get")
    public Universite retrieveUniversite(@RequestParam("id") long idUniversite) {
        return universiteService.getUniversiteById(idUniversite);

    }


    @GetMapping("get/{id}")
    public Universite retrieveUniversiteAnotherMethod(@PathVariable("id") long idUniversite) {
        return universiteService.getUniversiteById(idUniversite);

    }

    @PutMapping("/update")
    public Universite updatingUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);

    }

    @GetMapping("/getbynomuniv/{nom}")
    public Universite getUniversiteByNom(@PathVariable("nom") String nom) {
        return universiteService.getUniversiteByName(nom);
    }

    @PostMapping("/addUniversiteFoyer")
    public Universite addingFoyerUniversite(@RequestBody Universite universite) {
        return universiteService.affecterFoyerToUniversite(universite);

    }
    @PostMapping("/adfFoyerToSpecificUniversity/{id}")

    public Universite affecterFoyerToUniversite(@PathVariable("id") long iduniversite ,@RequestBody Foyer foyer   ) {
        return universiteService.affecterFoyerToUniversite(iduniversite, foyer);
    }


}
