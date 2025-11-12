package com.example.foyer.repositories;

import com.example.foyer.entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
    Bloc findByNomBloc(String nomBloc);

    List<Bloc> findAllByOrderByCapaciteBlocAsc();



}
