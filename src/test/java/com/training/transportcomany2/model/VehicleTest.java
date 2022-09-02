package com.training.transportcomany2.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VehicleTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Vehicle#Vehicle()}
     *   <li>{@link Vehicle#setVehicle_customer_id(int)}
     *   <li>{@link Vehicle#setVehicle_desription(String)}
     *   <li>{@link Vehicle#setVehicle_id(int)}
     *   <li>{@link Vehicle#setVehicle_number(int)}
     *   <li>{@link Vehicle#setVehicle_type(String)}
     *   <li>{@link Vehicle#toString()}
     *   <li>{@link Vehicle#getVehicle_customer_id()}
     *   <li>{@link Vehicle#getVehicle_desription()}
     *   <li>{@link Vehicle#getVehicle_id()}
     *   <li>{@link Vehicle#getVehicle_number()}
     *   <li>{@link Vehicle#getVehicle_type()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Vehicle actualVehicle = new Vehicle();
        actualVehicle.setVehicle_customer_id(1);
        actualVehicle.setVehicle_desription("Vehicle desription");
        actualVehicle.setVehicle_id(1);
        actualVehicle.setVehicle_number(10);
        actualVehicle.setVehicle_type("Vehicle type");
        String actualToStringResult = actualVehicle.toString();
        assertEquals(1, actualVehicle.getVehicle_customer_id());
        assertEquals("Vehicle desription", actualVehicle.getVehicle_desription());
        assertEquals(1, actualVehicle.getVehicle_id());
        assertEquals(10, actualVehicle.getVehicle_number());
        assertEquals("Vehicle type", actualVehicle.getVehicle_type());
        assertEquals("Vehicle [vehicle_id=1, vehicle_type=Vehicle type, vehicle_desription=Vehicle desription, vehicle"
                + "_customer_id=1, vehicle_number=10]", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Vehicle#Vehicle(int, String, String, int, int)}
     *   <li>{@link Vehicle#setVehicle_customer_id(int)}
     *   <li>{@link Vehicle#setVehicle_desription(String)}
     *   <li>{@link Vehicle#setVehicle_id(int)}
     *   <li>{@link Vehicle#setVehicle_number(int)}
     *   <li>{@link Vehicle#setVehicle_type(String)}
     *   <li>{@link Vehicle#toString()}
     *   <li>{@link Vehicle#getVehicle_customer_id()}
     *   <li>{@link Vehicle#getVehicle_desription()}
     *   <li>{@link Vehicle#getVehicle_id()}
     *   <li>{@link Vehicle#getVehicle_number()}
     *   <li>{@link Vehicle#getVehicle_type()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Vehicle actualVehicle = new Vehicle(1, "Vehicle type", "Vehicle desription", 1, 10);
        actualVehicle.setVehicle_customer_id(1);
        actualVehicle.setVehicle_desription("Vehicle desription");
        actualVehicle.setVehicle_id(1);
        actualVehicle.setVehicle_number(10);
        actualVehicle.setVehicle_type("Vehicle type");
        String actualToStringResult = actualVehicle.toString();
        assertEquals(1, actualVehicle.getVehicle_customer_id());
        assertEquals("Vehicle desription", actualVehicle.getVehicle_desription());
        assertEquals(1, actualVehicle.getVehicle_id());
        assertEquals(10, actualVehicle.getVehicle_number());
        assertEquals("Vehicle type", actualVehicle.getVehicle_type());
        assertEquals("Vehicle [vehicle_id=1, vehicle_type=Vehicle type, vehicle_desription=Vehicle desription, vehicle"
                + "_customer_id=1, vehicle_number=10]", actualToStringResult);
    }
}

