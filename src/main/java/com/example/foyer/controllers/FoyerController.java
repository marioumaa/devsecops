package com.example.foyer.controllers;

import com.example.foyer.entity.Bloc;
import com.example.foyer.entity.Foyer;
import com.example.foyer.services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/foyers")
public class FoyerController {

    @Autowired
    IFoyerService service;

    @PostMapping("/add")
    public Foyer addingFoyer(@RequestBody Foyer foyer) {
        return service.addFoyer(foyer);

    }
    @DeleteMapping("delete/{id}")
    public void removingFoyer(@PathVariable("id") int idFoyer) {
        service.deleteFoyer(idFoyer);
    }

    @GetMapping("getAll")
    public List<Foyer> getAllFoyer() {
        return service.getAllFoyers();
    }
    @GetMapping("get")
    public Foyer retrieveFoyer(@RequestParam("id") int idFoyer) {
        return service.getFoyerById(idFoyer);

    }




    @GetMapping("get/{id}")
    public Foyer retrieveFoyerAnotherMethod(@PathVariable("id") int idFoyer) {
        return service.getFoyerById(idFoyer);

    }



    @PutMapping("/update")
    public Foyer updatingFoyer(@RequestBody Foyer foyer) {
        return service.updateFoyer(foyer);

    }
}
