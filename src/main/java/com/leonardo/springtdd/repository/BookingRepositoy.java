package com.leonardo.springtdd.repository;

import com.leonardo.springtdd.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepositoy extends JpaRepository<Booking, String> {

    Optional<Booking> findByReserveName(String name);

}
