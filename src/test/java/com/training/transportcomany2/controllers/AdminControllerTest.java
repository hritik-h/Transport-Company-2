package com.training.transportcomany2.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.training.transportcomany2.dto.BookingDto;
import com.training.transportcomany2.dto.UserDto;
import com.training.transportcomany2.dto.VehicleDto;
import com.training.transportcomany2.model.Booking;
import com.training.transportcomany2.model.Vehicle;
import com.training.transportcomany2.services.BookingService;
import com.training.transportcomany2.services.UserService;
import com.training.transportcomany2.services.VehicleService;

import java.sql.Date;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;


@ContextConfiguration(classes = {AdminController.class})
@ExtendWith(SpringExtension.class)
@SpringBootTest
class AdminControllerTest {
    @Autowired
    private AdminController adminController;

    @MockBean
    private BookingService bookingService;

    @MockBean
    private ModelMapper modelMapper;

    @MockBean
    private PasswordEncoder passwordEncoder;

    @MockBean
    private UserService userService;

    @MockBean
    private VehicleService vehicleService;

    /**
     * Method under test: {@link AdminController#error(Model, Exception)}
     */
    @Test
    void testError() {
        ConcurrentModel m = new ConcurrentModel();
        assertEquals("error-page", adminController.error(m, new Exception("foo")));
    }

    /**
     * Method under test: {@link AdminController#error(Model, Exception)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testError2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.training.transportcomany2.controllers.AdminController.error(AdminController.java:82)
        //   In order to prevent error(Model, Exception)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   error(Model, Exception).
        //   See https://diff.blue/R013 to resolve this issue.

        adminController.error(new ConcurrentModel(), null);
    }

    /**
     * Method under test: {@link AdminController#userHandlerUpdate(UserDto, Model, HttpServletRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUserHandlerUpdate() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.training.transportcomany2.controllers.AdminController.userHandlerUpdate(AdminController.java:99)
        //   In order to prevent userHandlerUpdate(UserDto, Model, HttpServletRequest)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   userHandlerUpdate(UserDto, Model, HttpServletRequest).
        //   See https://diff.blue/R013 to resolve this issue.

        AdminController adminController = new AdminController();

        UserDto userDto = new UserDto();
        userDto.setAuthority("JaneDoe");
        userDto.setContactno(1);
        userDto.setFirstName("Jane");
        userDto.setId(1);
        userDto.setLastName("Doe");
        userDto.setPassword("iloveyou");
        userDto.setUname("Uname");
        ConcurrentModel model = new ConcurrentModel();
        adminController.userHandlerUpdate(userDto, model, new MockHttpServletRequest());
    }

    /**
     * Method under test: {@link AdminController#userHandlerUpdate(UserDto, Model, HttpServletRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUserHandlerUpdate2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.training.transportcomany2.controllers.AdminController.userHandlerUpdate(AdminController.java:99)
        //   In order to prevent userHandlerUpdate(UserDto, Model, HttpServletRequest)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   userHandlerUpdate(UserDto, Model, HttpServletRequest).
        //   See https://diff.blue/R013 to resolve this issue.

        AdminController adminController = new AdminController();
        UserDto userDto = mock(UserDto.class);
        doNothing().when(userDto).setAuthority((String) any());
        doNothing().when(userDto).setContactno(anyInt());
        doNothing().when(userDto).setFirstName((String) any());
        doNothing().when(userDto).setId(anyInt());
        doNothing().when(userDto).setLastName((String) any());
        doNothing().when(userDto).setPassword((String) any());
        doNothing().when(userDto).setUname((String) any());
        userDto.setAuthority("JaneDoe");
        userDto.setContactno(1);
        userDto.setFirstName("Jane");
        userDto.setId(1);
        userDto.setLastName("Doe");
        userDto.setPassword("iloveyou");
        userDto.setUname("Uname");
        ConcurrentModel model = new ConcurrentModel();
        adminController.userHandlerUpdate(userDto, model, new MockHttpServletRequest());
    }

    /**
     * Method under test: {@link AdminController#userHandler(UserDto, Model, HttpServletRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUserHandler() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.training.transportcomany2.controllers.AdminController.userHandler(AdminController.java:129)
        //   In order to prevent userHandler(UserDto, Model, HttpServletRequest)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   userHandler(UserDto, Model, HttpServletRequest).
        //   See https://diff.blue/R013 to resolve this issue.

        AdminController adminController = new AdminController();

        UserDto userDto = new UserDto();
        userDto.setAuthority("JaneDoe");
        userDto.setContactno(1);
        userDto.setFirstName("Jane");
        userDto.setId(1);
        userDto.setLastName("Doe");
        userDto.setPassword("iloveyou");
        userDto.setUname("Uname");
        ConcurrentModel model = new ConcurrentModel();
        adminController.userHandler(userDto, model, new MockHttpServletRequest());
    }

    /**
     * Method under test: {@link AdminController#userHandler(UserDto, Model, HttpServletRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUserHandler2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.training.transportcomany2.controllers.AdminController.userHandler(AdminController.java:129)
        //   In order to prevent userHandler(UserDto, Model, HttpServletRequest)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   userHandler(UserDto, Model, HttpServletRequest).
        //   See https://diff.blue/R013 to resolve this issue.

        AdminController adminController = new AdminController();
        UserDto userDto = mock(UserDto.class);
        when(userDto.getPassword()).thenReturn("iloveyou");
        doNothing().when(userDto).setAuthority((String) any());
        doNothing().when(userDto).setContactno(anyInt());
        doNothing().when(userDto).setFirstName((String) any());
        doNothing().when(userDto).setId(anyInt());
        doNothing().when(userDto).setLastName((String) any());
        doNothing().when(userDto).setPassword((String) any());
        doNothing().when(userDto).setUname((String) any());
        userDto.setAuthority("JaneDoe");
        userDto.setContactno(1);
        userDto.setFirstName("Jane");
        userDto.setId(1);
        userDto.setLastName("Doe");
        userDto.setPassword("iloveyou");
        userDto.setUname("Uname");
        ConcurrentModel model = new ConcurrentModel();
        adminController.userHandler(userDto, model, new MockHttpServletRequest());
    }

    /**
     * Method under test: {@link AdminController#allUsers(Model)}
     */
    @Test
    void testAllUsers() throws Exception {
        when(userService.allUsers()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin/allUsers");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("list"))
                .andExpect(MockMvcResultMatchers.view().name("list-users"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("list-users"));
    }

    /**
     * Method under test: {@link AdminController#allUsers(Model)}
     */
    @Test
    void testAllUsers2() throws Exception {
        when(userService.allUsers()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/admin/allUsers");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("list"))
                .andExpect(MockMvcResultMatchers.view().name("list-users"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("list-users"));
    }

    /**
     * Method under test: {@link AdminController#allVehicles(Model)}
     */
    @Test
    void testAllVehicles() throws Exception {
        when(vehicleService.allVehicles()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin/allVehicles");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("list"))
                .andExpect(MockMvcResultMatchers.view().name("list-vehicles"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("list-vehicles"));
    }

    /**
     * Method under test: {@link AdminController#allVehicles(Model)}
     */
    @Test
    void testAllVehicles2() throws Exception {
        when(vehicleService.allVehicles()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/admin/allVehicles");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("list"))
                .andExpect(MockMvcResultMatchers.view().name("list-vehicles"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("list-vehicles"));
    }

    /**
     * Method under test: {@link AdminController#allBookings(Model)}
     */
    @Test
    void testAllBookings() throws Exception {
        when(bookingService.allBookings()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin/allBookings");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("list"))
                .andExpect(MockMvcResultMatchers.view().name("list-booking"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("list-booking"));
    }

    /**
     * Method under test: {@link AdminController#allBookings(Model)}
     */
    @Test
    void testAllBookings2() throws Exception {
        when(bookingService.allBookings()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/admin/allBookings");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("list"))
                .andExpect(MockMvcResultMatchers.view().name("list-booking"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("list-booking"));
    }

    /**
     * Method under test: {@link AdminController#addVehicle(VehicleDto)}
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
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/admin/VehicleHandler");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("vehicleDto"))
                .andExpect(MockMvcResultMatchers.view().name("admin-dashboard"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("admin-dashboard"));
    }

    /**
     * Method under test: {@link AdminController#bookingHandler(BookingDto, Model)}
     */
    @Test
    void testBookingHandler() throws Exception {
        doNothing().when(bookingService).book((Booking) any());

        Booking booking = new Booking();
        booking.setDate(mock(Date.class));
        booking.setDestination("Destination");
        booking.setDriverId(123);
        booking.setSource("Source");
        booking.setUser_id(1);
        booking.setVehicle_id("Vehicle id");
        when(modelMapper.map((Object) any(), (Class<Booking>) any())).thenReturn(booking);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/admin/BookingHandler");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("bookingDto"))
                .andExpect(MockMvcResultMatchers.view().name("admin-dashboard"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("admin-dashboard"));
    }

    /**
     * Method under test: {@link AdminController#cancelBooking(HttpServletRequest)}
     */
    @Test
    void testCancelBooking() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/admin/BookingHandler-delete");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("msg"))
                .andExpect(MockMvcResultMatchers.view().name("error-page"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("error-page"));
    }

    /**
     * Method under test: {@link AdminController#cancelBooking(HttpServletRequest)}
     */
    @Test
    void testCancelBooking2() throws Exception {
        MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post("/admin/BookingHandler-delete");
        postResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(postResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("msg"))
                .andExpect(MockMvcResultMatchers.view().name("error-page"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("error-page"));
    }

    /**
     * Method under test: {@link AdminController#dahsboard(Model)}
     */
    @Test
    void testDahsboard() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin/dashboard");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("admin-dashboard"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("admin-dashboard"));
    }

    /**
     * Method under test: {@link AdminController#dahsboard(Model)}
     */
    @Test
    void testDahsboard2() throws Exception {
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/admin/dashboard");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("admin-dashboard"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("admin-dashboard"));
    }

    /**
     * Method under test: {@link AdminController#managerdahsboard(Model)}
     */
    @Test
    void testManagerdahsboard() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin/");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("managerlogin"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("managerlogin"));
    }

    /**
     * Method under test: {@link AdminController#managerdahsboard(Model)}
     */
    @Test
    void testManagerdahsboard2() throws Exception {
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/admin/");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("managerlogin"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("managerlogin"));
    }

    /**
     * Method under test: {@link AdminController#OneUser(Model, HttpServletRequest)}
     */
    @Test
    void testOneUser() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin/viewUser");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("msg"))
                .andExpect(MockMvcResultMatchers.view().name("error-page"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("error-page"));
    }

    /**
     * Method under test: {@link AdminController#OneUser(Model, HttpServletRequest)}
     */
    @Test
    void testOneUser2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin/viewUser", "Uri Variables");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("msg"))
                .andExpect(MockMvcResultMatchers.view().name("error-page"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("error-page"));
    }

    /**
     * Method under test: {@link AdminController#oneVehicle(Model, HttpServletRequest)}
     */
    @Test
    void testOneVehicle() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin/viewVehicle");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("msg"))
                .andExpect(MockMvcResultMatchers.view().name("error-page"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("error-page"));
    }

    /**
     * Method under test: {@link AdminController#oneVehicle(Model, HttpServletRequest)}
     */
    @Test
    void testOneVehicle2() throws Exception {
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/admin/viewVehicle");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("msg"))
                .andExpect(MockMvcResultMatchers.view().name("error-page"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("error-page"));
    }

    /**
     * Method under test: {@link AdminController#updateVehicle(VehicleDto)}
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
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/admin/VehicleHandler-update");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("vehicleDto"))
                .andExpect(MockMvcResultMatchers.view().name("admin-dashboard"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("admin-dashboard"));
    }

    /**
     * Method under test: {@link AdminController#updateVehicle(HttpServletRequest)}
     */
    @Test
    void testUpdateVehicle2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/admin/VehicleHandler-delete");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("msg"))
                .andExpect(MockMvcResultMatchers.view().name("error-page"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("error-page"));
    }

    /**
     * Method under test: {@link AdminController#updateVehicle(HttpServletRequest)}
     */
    @Test
    void testUpdateVehicle3() throws Exception {
        MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post("/admin/VehicleHandler-delete");
        postResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(postResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("msg"))
                .andExpect(MockMvcResultMatchers.view().name("error-page"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("error-page"));
    }

    /**
     * Method under test: {@link AdminController#userHandlerDelete(HttpServletRequest)}
     */
    @Test
    void testUserHandlerDelete() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/admin/UserHandler-delete");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("msg"))
                .andExpect(MockMvcResultMatchers.view().name("error-page"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("error-page"));
    }

    /**
     * Method under test: {@link AdminController#userHandlerDelete(HttpServletRequest)}
     */
    @Test
    void testUserHandlerDelete2() throws Exception {
        MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post("/admin/UserHandler-delete");
        postResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(postResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("msg"))
                .andExpect(MockMvcResultMatchers.view().name("error-page"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("error-page"));
    }
}

