package com.training.transportcomany2.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BookingDtoTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link BookingDto#BookingDto()}
     *   <li>{@link BookingDto#setDestination(String)}
     *   <li>{@link BookingDto#setDriverId(int)}
     *   <li>{@link BookingDto#setSource(String)}
     *   <li>{@link BookingDto#setUser_id(int)}
     *   <li>{@link BookingDto#setVehicle_id(String)}
     *   <li>{@link BookingDto#getDestination()}
     *   <li>{@link BookingDto#getDriverId()}
     *   <li>{@link BookingDto#getSource()}
     *   <li>{@link BookingDto#getUser_id()}
     *   <li>{@link BookingDto#getVehicle_id()}
     * </ul>
     */
    @Test
    void testConstructor() {
        BookingDto actualBookingDto = new BookingDto();
        actualBookingDto.setDestination("Destination");
        actualBookingDto.setDriverId(123);
        actualBookingDto.setSource("Source");
        actualBookingDto.setUser_id(1);
        actualBookingDto.setVehicle_id("Vehicle id");
        assertEquals("Destination", actualBookingDto.getDestination());
        assertEquals(123, actualBookingDto.getDriverId());
        assertEquals("Source", actualBookingDto.getSource());
        assertEquals(1, actualBookingDto.getUser_id());
        assertEquals("Vehicle id", actualBookingDto.getVehicle_id());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link BookingDto#BookingDto(int, String, String, String, int)}
     *   <li>{@link BookingDto#setDestination(String)}
     *   <li>{@link BookingDto#setDriverId(int)}
     *   <li>{@link BookingDto#setSource(String)}
     *   <li>{@link BookingDto#setUser_id(int)}
     *   <li>{@link BookingDto#setVehicle_id(String)}
     *   <li>{@link BookingDto#getDestination()}
     *   <li>{@link BookingDto#getDriverId()}
     *   <li>{@link BookingDto#getSource()}
     *   <li>{@link BookingDto#getUser_id()}
     *   <li>{@link BookingDto#getVehicle_id()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        BookingDto actualBookingDto = new BookingDto(1, "Vehicle id", "Source", "Destination", 123);
        actualBookingDto.setDestination("Destination");
        actualBookingDto.setDriverId(123);
        actualBookingDto.setSource("Source");
        actualBookingDto.setUser_id(1);
        actualBookingDto.setVehicle_id("Vehicle id");
        assertEquals("Destination", actualBookingDto.getDestination());
        assertEquals(123, actualBookingDto.getDriverId());
        assertEquals("Source", actualBookingDto.getSource());
        assertEquals(1, actualBookingDto.getUser_id());
        assertEquals("Vehicle id", actualBookingDto.getVehicle_id());
    }
}

