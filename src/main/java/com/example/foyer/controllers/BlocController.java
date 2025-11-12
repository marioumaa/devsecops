package com.example.foyer.controllers;

import com.example.foyer.entity.Bloc;
import com.example.foyer.services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/blocs")
public class BlocController {
    @Autowired
    IBlocService iblocService;

    @PostMapping("/add")
    public Bloc addingBloc(@RequestBody Bloc bloc) {
        return iblocService.addBloc(bloc);

    }
    @DeleteMapping("delete/{id}")
    public void removingBloc(@PathVariable("id") Long idbloc) {
        iblocService.deleteBloc(idbloc);
    }

    @GetMapping("getAll")
    public List<Bloc> getAllBloc() {
        return iblocService.getAllBlocs();
    }
    @GetMapping("get")
    public Bloc retrieveBloc(@RequestParam("id") Long idbloc) {
        return iblocService.getBlocById(idbloc);
        /*http://localhost:8080/api/blocs/get?id=3 */
    }


      @GetMapping("get-id/{id}")
       public Bloc retrieveBlocAnotherMethod(@PathVariable("id") Long idbloc) {
           return iblocService.getBlocById(idbloc);

       }


   @GetMapping("getby-capacity-Asc")
    public List<Bloc> getBlocByCapacityAsc() {
        return iblocService.getBlocByCapacityAsc();
    }

    @GetMapping("getby-name/{nomBloc}")
    public Bloc getBlocByNom(@PathVariable("nomBloc") String nom) {
        return iblocService.getBlocByName(nom);
    }





    @PutMapping("update")
    public Bloc updatingBloc(@RequestBody Bloc bloc) {
        return iblocService.updateBloc(bloc);

    }

    @PostMapping("/addBlocEtChambres")
   public Bloc ajouterBlocEtChambresAssocie(@RequestBody Bloc bloc)
   {
       return iblocService.ajouterBlocEtChambresAssocie(bloc);

   }
}
