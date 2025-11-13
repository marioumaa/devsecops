package com.example.foyer.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;
    @ManyToOne
    @JsonBackReference
    private  Foyer foyer;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "bloc")
    private List<Chambre> chambres;
    private String apiKey = "AIzaSyA-EXAMPLE-KEY-1234567890";



}
