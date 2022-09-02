package com.training.transportcomany2.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.training.transportcomany2.model.Driver;
import com.training.transportcomany2.repos.DriverRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {DriverService.class})
@ExtendWith(SpringExtension.class)
class DriverServiceTest {
    @MockBean
    private DriverRepo driverRepo;

    @Autowired
    private DriverService driverService;

    /**
     * Method under test: {@link DriverService#insert(Driver)}
     */
    @Test
    void testInsert() {
        Driver driver = new Driver();
        driver.setContactno(1);
        driver.setFirstName("Jane");
        driver.setId(1);
        driver.setLastName("Doe");
        driver.setPassword("iloveyou");
        driver.setUname("Uname");
        when(driverRepo.save((Driver) any())).thenReturn(driver);

        Driver driver1 = new Driver();
        driver1.setContactno(1);
        driver1.setFirstName("Jane");
        driver1.setId(1);
        driver1.setLastName("Doe");
        driver1.setPassword("iloveyou");
        driver1.setUname("Uname");
        driverService.insert(driver1);
        verify(driverRepo).save((Driver) any());
        assertEquals(1, driver1.getContactno());
        assertEquals("Uname", driver1.getUname());
        assertEquals("iloveyou", driver1.getPassword());
        assertEquals("Doe", driver1.getLastName());
        assertEquals(1, driver1.getId());
        assertEquals("Jane", driver1.getFirstName());
    }

    /**
     * Method under test: {@link DriverService#allUsers()}
     */
    @Test
    void testAllUsers() {
        ArrayList<Driver> driverList = new ArrayList<>();
        when(driverRepo.findAll()).thenReturn(driverList);
        List<Driver> actualAllUsersResult = driverService.allUsers();
        assertSame(driverList, actualAllUsersResult);
        assertTrue(actualAllUsersResult.isEmpty());
        verify(driverRepo).findAll();
    }

    /**
     * Method under test: {@link DriverService#findUser(long)}
     */
    @Test
    void testFindUser() {
        Driver driver = new Driver();
        driver.setContactno(1);
        driver.setFirstName("Jane");
        driver.setId(1);
        driver.setLastName("Doe");
        driver.setPassword("iloveyou");
        driver.setUname("Uname");
        Optional<Driver> ofResult = Optional.of(driver);
        when(driverRepo.findById((Long) any())).thenReturn(ofResult);
        Optional<Driver> actualFindUserResult = driverService.findUser(123L);
        assertSame(ofResult, actualFindUserResult);
        assertTrue(actualFindUserResult.isPresent());
        verify(driverRepo).findById((Long) any());
    }

    /**
     * Method under test: {@link DriverService#delete(long)}
     */
    @Test
    void testDelete() {
        doNothing().when(driverRepo).deleteById((Long) any());
        driverService.delete(123L);
        verify(driverRepo).deleteById((Long) any());
    }
}

