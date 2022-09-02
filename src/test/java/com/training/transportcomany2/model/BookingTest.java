package com.training.transportcomany2.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

import java.sql.Date;

import org.junit.jupiter.api.Test;

class BookingTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Booking#Booking()}
     *   <li>{@link Booking#setDate(Date)}
     *   <li>{@link Booking#setDestination(String)}
     *   <li>{@link Booking#setDriverId(int)}
     *   <li>{@link Booking#setSource(String)}
     *   <li>{@link Booking#setUser_id(int)}
     *   <li>{@link Booking#setVehicle_id(String)}
     *   <li>{@link Booking#toString()}
     *   <li>{@link Booking#getDate()}
     *   <li>{@link Booking#getDestination()}
     *   <li>{@link Booking#getDriverId()}
     *   <li>{@link Booking#getSource()}
     *   <li>{@link Booking#getUser_id()}
     *   <li>{@link Booking#getVehicle_id()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Booking actualBooking = new Booking();
        actualBooking.setDate(mock(Date.class));
        actualBooking.setDestination("Destination");
        actualBooking.setDriverId(123);
        actualBooking.setSource("Source");
        actualBooking.setUser_id(1);
        actualBooking.setVehicle_id("Vehicle id");
        actualBooking.toString();
        Date expectedDate = actualBooking.date;
        assertSame(expectedDate, actualBooking.getDate());
        assertEquals("Destination", actualBooking.getDestination());
        assertEquals(123, actualBooking.getDriverId());
        assertEquals("Source", actualBooking.getSource());
        assertEquals(1, actualBooking.getUser_id());
        assertEquals("Vehicle id", actualBooking.getVehicle_id());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Booking#Booking(int, String, String, String, int, Date)}
     *   <li>{@link Booking#setDate(Date)}
     *   <li>{@link Booking#setDestination(String)}
     *   <li>{@link Booking#setDriverId(int)}
     *   <li>{@link Booking#setSource(String)}
     *   <li>{@link Booking#setUser_id(int)}
     *   <li>{@link Booking#setVehicle_id(String)}
     *   <li>{@link Booking#toString()}
     *   <li>{@link Booking#getDate()}
     *   <li>{@link Booking#getDestination()}
     *   <li>{@link Booking#getDriverId()}
     *   <li>{@link Booking#getSource()}
     *   <li>{@link Booking#getUser_id()}
     *   <li>{@link Booking#getVehicle_id()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Booking actualBooking = new Booking(1, "Vehicle id", "Source", "Destination", 123, mock(Date.class));
        actualBooking.setDate(mock(Date.class));
        actualBooking.setDestination("Destination");
        actualBooking.setDriverId(123);
        actualBooking.setSource("Source");
        actualBooking.setUser_id(1);
        actualBooking.setVehicle_id("Vehicle id");
        actualBooking.toString();
        Date expectedDate = actualBooking.date;
        assertSame(expectedDate, actualBooking.getDate());
        assertEquals("Destination", actualBooking.getDestination());
        assertEquals(123, actualBooking.getDriverId());
        assertEquals("Source", actualBooking.getSource());
        assertEquals(1, actualBooking.getUser_id());
        assertEquals("Vehicle id", actualBooking.getVehicle_id());
    }
}

