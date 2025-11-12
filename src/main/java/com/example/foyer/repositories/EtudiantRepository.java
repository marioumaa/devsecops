package com.example.foyer.repositories;

import com.example.foyer.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findByReservationsEstValideTrueAndReservationsAnneeUniversitaireBetween(Date start, Date end);
}
