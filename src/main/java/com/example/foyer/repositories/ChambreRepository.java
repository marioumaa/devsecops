package com.example.foyer.repositories;

import com.example.foyer.entity.Chambre;
import com.example.foyer.entity.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findByTypeCLike(TypeChambre type  );
    long countByReservationsEstValideFalseAndReservationsAnneeUniversitaireLessThan(Date currentYear);

}
