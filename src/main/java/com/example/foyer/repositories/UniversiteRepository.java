package com.example.foyer.repositories;

import com.example.foyer.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    public Universite findByNomUniversite(String nomUniversite);
}
