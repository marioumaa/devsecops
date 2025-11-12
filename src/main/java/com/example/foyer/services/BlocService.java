package com.example.foyer.services;

import com.example.foyer.entity.Bloc;
import com.example.foyer.entity.Chambre;
import com.example.foyer.repositories.BlocRepository;
import com.example.foyer.repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocService implements IBlocService{


    @Autowired
   BlocRepository blocRepository;
    ChambreRepository chambreRepository;
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);

    }

    @Override
    public void deleteBloc(Long idBloc) {
         blocRepository.deleteById(idBloc);
    }

    @Override
    public Bloc getBlocById(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return (List<Bloc>) blocRepository.findAll();
    }

    @Override
    public Bloc getBlocByName(String name) {
        return blocRepository.findByNomBloc(name);
    }

    @Override
    public List<Bloc> getBlocByCapacityAsc() {
        return blocRepository.findAllByOrderByCapaciteBlocAsc();
    }

    @Override
    public Bloc ajouterBlocEtChambresAssocie(Bloc bloc) {
        //return  blocRepository.save(bloc);
        // pour qu'on voit id du bloc dans entité chambre donc il faut faire get de liste chambre et
        Bloc b= blocRepository.save(bloc);
        b.getChambres().forEach(chambre ->
                {
                    chambre.setBloc(b);
                    chambreRepository.save(chambre);
                }

                );

return b;
    }

}
