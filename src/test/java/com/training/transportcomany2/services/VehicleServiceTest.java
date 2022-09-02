package com.training.transportcomany2.services;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.training.transportcomany2.model.Vehicle;
import com.training.transportcomany2.repos.VehicleRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {VehicleService.class})
@ExtendWith(SpringExtension.class)
class VehicleServiceTest {
    @MockBean
    private VehicleRepo vehicleRepo;

    @Autowired
    private VehicleService vehicleService;

    /**
     * Method under test: {@link VehicleService#insert(Vehicle)}
     */
    @Test
    void testInsert() {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicle_customer_id(1);
        vehicle.setVehicle_desription("Vehicle desription");
        vehicle.setVehicle_id(1);
        vehicle.setVehicle_number(10);
        vehicle.setVehicle_type("Vehicle type");
        when(vehicleRepo.save((Vehicle) any())).thenReturn(vehicle);

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicle_customer_id(1);
        vehicle1.setVehicle_desription("Vehicle desription");
        vehicle1.setVehicle_id(1);
        vehicle1.setVehicle_number(10);
        vehicle1.setVehicle_type("Vehicle type");
        assertSame(vehicle, vehicleService.insert(vehicle1));
        verify(vehicleRepo).save((Vehicle) any());
    }

    /**
     * Method under test: {@link VehicleService#allVehicles()}
     */
    @Test
    void testAllVehicles() {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        when(vehicleRepo.findAll()).thenReturn(vehicleList);
        List<Vehicle> actualAllVehiclesResult = vehicleService.allVehicles();
        assertSame(vehicleList, actualAllVehiclesResult);
        assertTrue(actualAllVehiclesResult.isEmpty());
        verify(vehicleRepo).findAll();
    }

    /**
     * Method under test: {@link VehicleService#findVehicle(int)}
     */
    @Test
    void testFindVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicle_customer_id(1);
        vehicle.setVehicle_desription("Vehicle desription");
        vehicle.setVehicle_id(1);
        vehicle.setVehicle_number(10);
        vehicle.setVehicle_type("Vehicle type");
        Optional<Vehicle> ofResult = Optional.of(vehicle);
        when(vehicleRepo.findById((Integer) any())).thenReturn(ofResult);
        Optional<Vehicle> actualFindVehicleResult = vehicleService.findVehicle(1);
        assertSame(ofResult, actualFindVehicleResult);
        assertTrue(actualFindVehicleResult.isPresent());
        verify(vehicleRepo).findById((Integer) any());
    }

    /**
     * Method under test: {@link VehicleService#deleteVehicle(int)}
     */
    @Test
    void testDeleteVehicle() {
        doNothing().when(vehicleRepo).deleteById((Integer) any());
        vehicleService.deleteVehicle(1);
        verify(vehicleRepo).deleteById((Integer) any());
    }
}

