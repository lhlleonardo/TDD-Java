package com.leonardo.springtdd;

import com.leonardo.springtdd.model.Booking;
import com.leonardo.springtdd.repository.BookingRepositoy;
import com.leonardo.springtdd.service.BookingService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Optional;

@RunWith(SpringRunner.class)
public class BookingServiceTest {

    @TestConfiguration
    static class BookingServiceTestConfiguration {

        @Bean
        public BookingService bookingService() {
            return new BookingService();
        }
    }

    @Autowired
    BookingService bookingService;

    @MockBean
    BookingRepositoy bookingRepositoy;

    @Test
    public void bookingTestServiceDaysCalculator() {
        String name = "Leonardo";

        int days = bookingService.daysCalculatorWithDatabase(name);

        Assertions.assertEquals(days, 10);
    }

    @Before
    public void setup() {

        LocalDate checkIn = LocalDate.parse("2022-11-10");
        LocalDate checkOut = LocalDate.parse("2022-11-20");

        Booking booking = new Booking("1", "Leonardo", checkIn, checkOut, 2);

        Mockito.when(bookingRepositoy.findByReserveName(booking.getReserveName()))
                .thenReturn(java.util.Optional.of(booking));

    }
}
