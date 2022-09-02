package com.training.transportcomany2.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.when;

import com.training.transportcomany2.dto.VehicleDto;
import com.training.transportcomany2.model.Vehicle;
import com.training.transportcomany2.services.VehicleService;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {ManagerController.class})
@ExtendWith(SpringExtension.class)
class ManagerControllerTest {
    @Autowired
    private ManagerController managerController;

    @MockBean
    private ModelMapper modelMapper;

    @MockBean
    private VehicleService vehicleService;

    /**
     * Method under test: {@link ManagerController#error(Model, Exception)}
     */
    @Test
    void testError() {
        ConcurrentModel m = new ConcurrentModel();
        assertEquals("error-page", managerController.error(m, new Exception("foo")));
    }

    /**
     * Method under test: {@link ManagerController#error(Model, Exception)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testError2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.training.transportcomany2.controllers.ManagerController.error(ManagerController.java:85)
        //   In order to prevent error(Model, Exception)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   error(Model, Exception).
        //   See https://diff.blue/R013 to resolve this issue.

        managerController.error(new ConcurrentModel(), null);
    }

    /**
     * Method under test: {@link ManagerController#addVehicle(VehicleDto)}
     */
    @Test
    void testAddVehicle() throws Exception {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicle_customer_id(1);
        vehicle.setVehicle_desription("Vehicle desription");
        vehicle.setVehicle_id(1);
        vehicle.setVehicle_number(10);
        vehicle.setVehicle_type("Vehicle type");
        when(modelMapper.map((Object) any(), (Class<Vehicle>) any())).thenReturn(vehicle);

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicle_customer_id(1);
        vehicle1.setVehicle_desription("Vehicle desription");
        vehicle1.setVehicle_id(1);
        vehicle1.setVehicle_number(10);
        vehicle1.setVehicle_type("Vehicle type");
        when(vehicleService.insert((Vehicle) any())).thenReturn(vehicle1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/manager/VehicleHandler");
        MockMvcBuilders.standaloneSetup(managerController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("vehicleDto"))
                .andExpect(MockMvcResultMatchers.view().name("managerlogin"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("managerlogin"));
    }

    /**
     * Method under test: {@link ManagerController#getAllVehcile()}
     */
    @Test
    void testGetAllVehcile() throws Exception {
        when(vehicleService.allVehicles()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/manager/allvehicle");
        MockMvcBuilders.standaloneSetup(managerController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("vehicles"))
                .andExpect(MockMvcResultMatchers.view().name("viewvehicles-manager"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("viewvehicles-manager"));
    }

    /**
     * Method under test: {@link ManagerController#getAllVehcile()}
     */
    @Test
    void testGetAllVehcile2() throws Exception {
        when(vehicleService.allVehicles()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/manager/allvehicle");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(managerController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("vehicles"))
                .andExpect(MockMvcResultMatchers.view().name("viewvehicles-manager"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("viewvehicles-manager"));
    }

    /**
     * Method under test: {@link ManagerController#goToUpdateVehiclePage(int)}
     */
    @Test
    void testGoToUpdateVehiclePage() throws Exception {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicle_customer_id(1);
        vehicle.setVehicle_desription("Vehicle desription");
        vehicle.setVehicle_id(1);
        vehicle.setVehicle_number(10);
        vehicle.setVehicle_type("Vehicle type");
        Optional<Vehicle> ofResult = Optional.of(vehicle);
        when(vehicleService.findVehicle(anyInt())).thenReturn(ofResult);
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/manager/updatevehicle");
        MockHttpServletRequestBuilder requestBuilder = getResult.param("vehicleId", String.valueOf(1));
        MockMvcBuilders.standaloneSetup(managerController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("vehicle"))
                .andExpect(MockMvcResultMatchers.view().name("updateVehicle-manager"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("updateVehicle-manager"));
    }

    /**
     * Method under test: {@link ManagerController#goToUpdateVehiclePage(int)}
     */
    @Test
    void testGoToUpdateVehiclePage2() throws Exception {
        when(vehicleService.findVehicle(anyInt())).thenReturn(Optional.empty());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/manager/updatevehicle");
        MockHttpServletRequestBuilder requestBuilder = getResult.param("vehicleId", String.valueOf(1));
        MockMvcBuilders.standaloneSetup(managerController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("msg"))
                .andExpect(MockMvcResultMatchers.view().name("error-page"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("error-page"));
    }

    /**
     * Method under test: {@link ManagerController#managerVehicleAdd(Model)}
     */
    @Test
    void testManagerVehicleAdd() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/manager/addvehicle");
        MockMvcBuilders.standaloneSetup(managerController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("addvehicle-manager"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("addvehicle-manager"));
    }

    /**
     * Method under test: {@link ManagerController#managerVehicleAdd(Model)}
     */
    @Test
    void testManagerVehicleAdd2() throws Exception {
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/manager/addvehicle");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(managerController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("addvehicle-manager"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("addvehicle-manager"));
    }

    /**
     * Method under test: {@link ManagerController#managerdahsboard(Model)}
     */
    @Test
    void testManagerdahsboard() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/manager/");
        MockMvcBuilders.standaloneSetup(managerController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("managerlogin"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("managerlogin"));
    }

    /**
     * Method under test: {@link ManagerController#managerdahsboard(Model)}
     */
    @Test
    void testManagerdahsboard2() throws Exception {
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/manager/");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(managerController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("managerlogin"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("managerlogin"));
    }

    /**
     * Method under test: {@link ManagerController#updateVehicle(VehicleDto)}
     */
    @Test
    void testUpdateVehicle() throws Exception {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicle_customer_id(1);
        vehicle.setVehicle_desription("Vehicle desription");
        vehicle.setVehicle_id(1);
        vehicle.setVehicle_number(10);
        vehicle.setVehicle_type("Vehicle type");
        when(modelMapper.map((Object) any(), (Class<Vehicle>) any())).thenReturn(vehicle);

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicle_customer_id(1);
        vehicle1.setVehicle_desription("Vehicle desription");
        vehicle1.setVehicle_id(1);
        vehicle1.setVehicle_number(10);
        vehicle1.setVehicle_type("Vehicle type");
        when(vehicleService.insert((Vehicle) any())).thenReturn(vehicle1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/manager/VehicleHandler-update");
        MockMvcBuilders.standaloneSetup(managerController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("vehicleDto"))
                .andExpect(MockMvcResultMatchers.view().name(""));
    }
}

