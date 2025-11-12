package com.example.foyer.controllers;

import com.example.foyer.entity.Reservation;
import com.example.foyer.services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/reservations")
public class ReservationController {
    IReservationService reservationService;


    @GetMapping("/getall")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }
    @GetMapping("/getbyid/{id}")
    public Reservation getReservationById(@PathVariable int id) {
        return reservationService.getReservationById(id);
    }
    @PostMapping("/add")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteReservation(@PathVariable int id) {
        reservationService.deleteReservation(id);
    }
    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @GetMapping("/getbyannee/{date1}/{date2}")
    public List<Reservation> getReservationsByAnnee(@PathVariable("date1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1, @PathVariable("date2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date2) {
        return reservationService.getReservationsByAnnee(date1, date2);
    }
}
