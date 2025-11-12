package com.example.foyer.controllers;
import com.example.foyer.entity.Chambre;
import com.example.foyer.entity.TypeChambre;
import com.example.foyer.services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/chambres")
public class ChambreController {
    @Autowired
    IChambreService chambreService;

    @PostMapping("/add")
    public Chambre addingChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }
    @PutMapping("/update")
    public Chambre updatingChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }
    @DeleteMapping("/delete/{ref}")
    public void deletingChambre(@PathVariable("ref") Long idChambre) {
        chambreService.deleteChambre(idChambre);
    }

    @GetMapping("/getall")
    public List<Chambre> gettingAllChambres()
    {
        return chambreService.getAllChambres();
    }
    @GetMapping("/getbyid/{ref}")
    public Chambre getChambreById(@PathVariable("ref") long idChambre)
    {
        return chambreService.getChambreById(idChambre);
    }

    @GetMapping("/getbyid")
    public Chambre getById(@RequestParam("id") long idChambre)
    {
        return chambreService.getChambreById(idChambre);
    }

    @GetMapping("/getbytype/{type}")
    public List<Chambre> getByType(@PathVariable("type") TypeChambre type)
    {
        return chambreService.getChambreByType(type);
    }
}
