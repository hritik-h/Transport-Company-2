package com.training.transportcomany2;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.training.transportcomany2.model.User;
import com.training.transportcomany2.model.Vehicle;
import com.training.transportcomany2.repos.UserRepo;
import com.training.transportcomany2.repos.VehicleRepo;
import com.training.transportcomany2.services.UserService;
import com.training.transportcomany2.services.VehicleService;
/**
 * 
 * @author Hritik
 * Tests
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TransportCompany2ApplicationTests {
	
	
	@Test
	public void contextLoads() {}
}
