package com.example.foyer.repositories;

import com.example.foyer.entity.Bloc;
import com.example.foyer.entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Integer> {
}
