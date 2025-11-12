package com.example.foyer.services;

import com.example.foyer.entity.Reservation;
import com.example.foyer.repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.hibernate.grammars.hql.HqlParser;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {

    ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservationById(long idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public void deleteReservation(long idReservation) {
reservationRepository.deleteById(idReservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public List<Reservation> getReservationsByAnnee(Date date1, Date date2) {
        return (List<Reservation>) reservationRepository.findByAnneeUniversitaireBetween(date1, date2);
    }


}
