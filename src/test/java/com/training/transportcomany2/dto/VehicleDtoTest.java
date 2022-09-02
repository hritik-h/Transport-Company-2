package com.training.transportcomany2.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VehicleDtoTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link VehicleDto#VehicleDto()}
     *   <li>{@link VehicleDto#setVehicle_customer_id(int)}
     *   <li>{@link VehicleDto#setVehicle_desription(String)}
     *   <li>{@link VehicleDto#setVehicle_id(int)}
     *   <li>{@link VehicleDto#setVehicle_number(int)}
     *   <li>{@link VehicleDto#setVehicle_type(String)}
     *   <li>{@link VehicleDto#getVehicle_customer_id()}
     *   <li>{@link VehicleDto#getVehicle_desription()}
     *   <li>{@link VehicleDto#getVehicle_id()}
     *   <li>{@link VehicleDto#getVehicle_number()}
     *   <li>{@link VehicleDto#getVehicle_type()}
     * </ul>
     */
    @Test
    void testConstructor() {
        VehicleDto actualVehicleDto = new VehicleDto();
        actualVehicleDto.setVehicle_customer_id(1);
        actualVehicleDto.setVehicle_desription("Vehicle desription");
        actualVehicleDto.setVehicle_id(1);
        actualVehicleDto.setVehicle_number(10);
        actualVehicleDto.setVehicle_type("Vehicle type");
        assertEquals(1, actualVehicleDto.getVehicle_customer_id());
        assertEquals("Vehicle desription", actualVehicleDto.getVehicle_desription());
        assertEquals(1, actualVehicleDto.getVehicle_id());
        assertEquals(10, actualVehicleDto.getVehicle_number());
        assertEquals("Vehicle type", actualVehicleDto.getVehicle_type());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link VehicleDto#VehicleDto(int, String, String, int, int)}
     *   <li>{@link VehicleDto#setVehicle_customer_id(int)}
     *   <li>{@link VehicleDto#setVehicle_desription(String)}
     *   <li>{@link VehicleDto#setVehicle_id(int)}
     *   <li>{@link VehicleDto#setVehicle_number(int)}
     *   <li>{@link VehicleDto#setVehicle_type(String)}
     *   <li>{@link VehicleDto#getVehicle_customer_id()}
     *   <li>{@link VehicleDto#getVehicle_desription()}
     *   <li>{@link VehicleDto#getVehicle_id()}
     *   <li>{@link VehicleDto#getVehicle_number()}
     *   <li>{@link VehicleDto#getVehicle_type()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        VehicleDto actualVehicleDto = new VehicleDto(1, "Vehicle type", "Vehicle desription", 1, 10);
        actualVehicleDto.setVehicle_customer_id(1);
        actualVehicleDto.setVehicle_desription("Vehicle desription");
        actualVehicleDto.setVehicle_id(1);
        actualVehicleDto.setVehicle_number(10);
        actualVehicleDto.setVehicle_type("Vehicle type");
        assertEquals(1, actualVehicleDto.getVehicle_customer_id());
        assertEquals("Vehicle desription", actualVehicleDto.getVehicle_desription());
        assertEquals(1, actualVehicleDto.getVehicle_id());
        assertEquals(10, actualVehicleDto.getVehicle_number());
        assertEquals("Vehicle type", actualVehicleDto.getVehicle_type());
    }
}

