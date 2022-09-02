package com.training.transportcomany2.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.training.transportcomany2.model.Booking;
import com.training.transportcomany2.repos.BookingRepo;

import java.sql.Date;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {BookingService.class})
@ExtendWith(SpringExtension.class)
class BookingServiceTest {
    @MockBean
    private BookingRepo bookingRepo;

    @Autowired
    private BookingService bookingService;

    /**
     * Method under test: {@link BookingService#book(Booking)}
     */
    @Test
    void testBook() {
        Booking booking = new Booking();
        booking.setDate(mock(Date.class));
        booking.setDestination("Destination");
        booking.setDriverId(123);
        booking.setSource("Source");
        booking.setUser_id(1);
        booking.setVehicle_id("Vehicle id");
        when(bookingRepo.save((Booking) any())).thenReturn(booking);

        Booking booking1 = new Booking();
        booking1.setDate(mock(Date.class));
        booking1.setDestination("Destination");
        booking1.setDriverId(123);
        booking1.setSource("Source");
        booking1.setUser_id(1);
        booking1.setVehicle_id("Vehicle id");
        bookingService.book(booking1);
        verify(bookingRepo).save((Booking) any());
        assertEquals("Vehicle id", booking1.getVehicle_id());
        assertEquals(1, booking1.getUser_id());
        assertEquals("Source", booking1.getSource());
        assertEquals(123, booking1.getDriverId());
        assertEquals("Destination", booking1.getDestination());
    }

    /**
     * Method under test: {@link BookingService#allBookings()}
     */
    @Test
    void testAllBookings() {
        ArrayList<Booking> bookingList = new ArrayList<>();
        when(bookingRepo.findAll()).thenReturn(bookingList);
        List<Booking> actualAllBookingsResult = bookingService.allBookings();
        assertSame(bookingList, actualAllBookingsResult);
        assertTrue(actualAllBookingsResult.isEmpty());
        verify(bookingRepo).findAll();
    }

    /**
     * Method under test: {@link BookingService#findBooking(int)}
     */
    @Test
    void testFindBooking() {
        Booking booking = new Booking();
        booking.setDate(mock(Date.class));
        booking.setDestination("Destination");
        booking.setDriverId(123);
        booking.setSource("Source");
        booking.setUser_id(1);
        booking.setVehicle_id("Vehicle id");
        Optional<Booking> ofResult = Optional.of(booking);
        when(bookingRepo.findById((Integer) any())).thenReturn(ofResult);
        Optional<Booking> actualFindBookingResult = bookingService.findBooking(1);
        assertSame(ofResult, actualFindBookingResult);
        assertTrue(actualFindBookingResult.isPresent());
        verify(bookingRepo).findById((Integer) any());
    }

    /**
     * Method under test: {@link BookingService#delete(int)}
     */
    @Test
    void testDelete() {
        doNothing().when(bookingRepo).deleteById((Integer) any());
        bookingService.delete(1);
        verify(bookingRepo).deleteById((Integer) any());
    }
}

