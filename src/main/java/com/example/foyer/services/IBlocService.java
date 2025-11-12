package com.example.foyer.services;

import com.example.foyer.entity.Bloc;

import java.util.List;

public interface IBlocService {


    public Bloc addBloc(Bloc bloc);
    public Bloc updateBloc(Bloc bloc);
    public void deleteBloc(Long idBloc);
    public Bloc getBlocById (Long idBloc);
    public List<Bloc> getAllBlocs();
    public Bloc getBlocByName(String name);
    public  List<Bloc> getBlocByCapacityAsc();
    public Bloc ajouterBlocEtChambresAssocie( Bloc bloc) ;
}
