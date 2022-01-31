package com.leonardo.springtdd.service;

import com.leonardo.springtdd.model.Booking;
import com.leonardo.springtdd.repository.BookingRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    BookingRepositoy bookingRepositoy;

    public int daysCalculatorWithDatabase(String name) {

        Optional<Booking> bookingOptional = bookingRepositoy.findByReserveName(name);

        return Period.between(bookingOptional.get().getCheckIn(), bookingOptional.get().getCheckOut()).getDays();
    }
}
