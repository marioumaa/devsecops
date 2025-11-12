package com.example.foyer.entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;
    private Long capaciteFoyer;

@OneToOne(mappedBy = "foyer")
    private Universite universite;
@OneToMany(cascade =CascadeType.ALL, mappedBy = "foyer")
@JsonManagedReference
   private List<Bloc> blocs;

    // Getters et setters
}
