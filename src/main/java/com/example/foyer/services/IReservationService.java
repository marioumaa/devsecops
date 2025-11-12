package com.example.foyer.services;

import com.example.foyer.entity.Foyer;
import com.example.foyer.entity.Reservation;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.List;

public interface IReservationService {



    public Reservation addReservation(Reservation reservation);
    public Reservation updateReservation(Reservation reservation);

    public Reservation getReservationById (long idReservation);

    void deleteReservation(long idReservation);

    public List<Reservation> getAllReservations();
public List<Reservation> getReservationsByAnnee(Date date1, Date date2);
}
