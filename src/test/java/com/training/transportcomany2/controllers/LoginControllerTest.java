package com.training.transportcomany2.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.sun.security.auth.UserPrincipal;
import com.training.transportcomany2.dto.UserDto;
import com.training.transportcomany2.model.Authorities;
import com.training.transportcomany2.model.User;
import com.training.transportcomany2.repos.UserRepo;
import com.training.transportcomany2.services.UserService;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {LoginController.class})
@ExtendWith(SpringExtension.class)
class LoginControllerTest {
    @Autowired
    private LoginController loginController;

    @MockBean
    private ModelMapper modelMapper;

    @MockBean
    private PasswordEncoder passwordEncoder;

    @MockBean
    private UserRepo userRepo;

    @MockBean
    private UserService userService;

    /**
     * Method under test: {@link LoginController#addCommnData(Principal, Model)}
     */
    @Test
    void testAddCommnData() {
        User user = new User();
        user.setAuthorities(new Authorities());
        user.setContactno(1);
        user.setFirstName("Jane");
        user.setId(1);
        user.setLastName("Doe");
        user.setPassword("iloveyou");
        user.setUname("Uname");

        Authorities authorities = new Authorities();
        authorities.setAuthority("JaneDoe");
        authorities.setUname("Uname");
        authorities.setUser(user);

        User user1 = new User();
        user1.setAuthorities(authorities);
        user1.setContactno(1);
        user1.setFirstName("Jane");
        user1.setId(1);
        user1.setLastName("Doe");
        user1.setPassword("iloveyou");
        user1.setUname("Uname");

        Authorities authorities1 = new Authorities();
        authorities1.setAuthority("JaneDoe");
        authorities1.setUname("Uname");
        authorities1.setUser(user1);

        User user2 = new User();
        user2.setAuthorities(authorities1);
        user2.setContactno(1);
        user2.setFirstName("Jane");
        user2.setId(1);
        user2.setLastName("Doe");
        user2.setPassword("iloveyou");
        user2.setUname("Uname");
        when(userRepo.findByUname((String) any())).thenReturn(user2);
        UserPrincipal p = new UserPrincipal("p");
        loginController.addCommnData(p, new ConcurrentModel());
        verify(userRepo).findByUname((String) any());
        assertTrue(loginController.logger instanceof ch.qos.logback.classic.Logger);
    }

    /**
     * Method under test: {@link LoginController#addCommnData(Principal, Model)}
     */
    @Test
    void testAddCommnData2() {
        User user = new User();
        user.setAuthorities(new Authorities());
        user.setContactno(1);
        user.setFirstName("Jane");
        user.setId(1);
        user.setLastName("Doe");
        user.setPassword("iloveyou");
        user.setUname("Uname");

        Authorities authorities = new Authorities();
        authorities.setAuthority("JaneDoe");
        authorities.setUname("Uname");
        authorities.setUser(user);

        User user1 = new User();
        user1.setAuthorities(authorities);
        user1.setContactno(1);
        user1.setFirstName("Jane");
        user1.setId(1);
        user1.setLastName("Doe");
        user1.setPassword("iloveyou");
        user1.setUname("Uname");

        Authorities authorities1 = new Authorities();
        authorities1.setAuthority("JaneDoe");
        authorities1.setUname("Uname");
        authorities1.setUser(user1);

        User user2 = new User();
        user2.setAuthorities(authorities1);
        user2.setContactno(1);
        user2.setFirstName("Jane");
        user2.setId(1);
        user2.setLastName("Doe");
        user2.setPassword("iloveyou");
        user2.setUname("Uname");
        when(userRepo.findByUname((String) any())).thenReturn(user2);
        loginController.addCommnData(null, new ConcurrentModel());
        assertTrue(loginController.logger instanceof ch.qos.logback.classic.Logger);
    }

    /**
     * Method under test: {@link LoginController#login()}
     */
    @Test
    void testLogin() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [login]: would dispatch back to the current handler URL [/login] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1404)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1148)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1087)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent login()
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   login().
        //   See https://diff.blue/R013 to resolve this issue.

        assertEquals("login", (new LoginController()).login());
    }

    /**
     * Method under test: {@link LoginController#accessDenied()}
     */
    @Test
    void testAccessDenied() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [access-denied]: would dispatch back to the current handler URL [/access-denied] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1404)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1148)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1087)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent accessDenied()
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   accessDenied().
        //   See https://diff.blue/R013 to resolve this issue.

        assertEquals("access-denied", (new LoginController()).accessDenied());
    }

    /**
     * Method under test: {@link LoginController#createUser(UserDto, HttpSession)}
     */
    @Test
    void testCreateUser() throws Exception {
        User user = new User();
        user.setAuthorities(new Authorities());
        user.setContactno(1);
        user.setFirstName("Jane");
        user.setId(1);
        user.setLastName("Doe");
        user.setPassword("iloveyou");
        user.setUname("Uname");

        Authorities authorities = new Authorities();
        authorities.setAuthority("JaneDoe");
        authorities.setUname("Uname");
        authorities.setUser(user);

        User user1 = new User();
        user1.setAuthorities(authorities);
        user1.setContactno(1);
        user1.setFirstName("Jane");
        user1.setId(1);
        user1.setLastName("Doe");
        user1.setPassword("iloveyou");
        user1.setUname("Uname");

        Authorities authorities1 = new Authorities();
        authorities1.setAuthority("JaneDoe");
        authorities1.setUname("Uname");
        authorities1.setUser(user1);

        User user2 = new User();
        user2.setAuthorities(authorities1);
        user2.setContactno(1);
        user2.setFirstName("Jane");
        user2.setId(1);
        user2.setLastName("Doe");
        user2.setPassword("iloveyou");
        user2.setUname("Uname");
        when(modelMapper.map((Object) any(), (Class<User>) any())).thenReturn(user2);

        User user3 = new User();
        user3.setAuthorities(new Authorities());
        user3.setContactno(1);
        user3.setFirstName("Jane");
        user3.setId(1);
        user3.setLastName("Doe");
        user3.setPassword("iloveyou");
        user3.setUname("Uname");

        Authorities authorities2 = new Authorities();
        authorities2.setAuthority("JaneDoe");
        authorities2.setUname("Uname");
        authorities2.setUser(user3);

        User user4 = new User();
        user4.setAuthorities(authorities2);
        user4.setContactno(1);
        user4.setFirstName("Jane");
        user4.setId(1);
        user4.setLastName("Doe");
        user4.setPassword("iloveyou");
        user4.setUname("Uname");

        Authorities authorities3 = new Authorities();
        authorities3.setAuthority("JaneDoe");
        authorities3.setUname("Uname");
        authorities3.setUser(user4);

        User user5 = new User();
        user5.setAuthorities(authorities3);
        user5.setContactno(1);
        user5.setFirstName("Jane");
        user5.setId(1);
        user5.setLastName("Doe");
        user5.setPassword("iloveyou");
        user5.setUname("Uname");
        when(userService.existsUserByUname((String) any())).thenReturn(true);
        when(userService.insert((User) any())).thenReturn(user5);
        when(passwordEncoder.encode((CharSequence) any())).thenReturn("secret");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/signUp");
        MockMvcBuilders.standaloneSetup(loginController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("userDto"))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/login"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/login"));
    }

    /**
     * Method under test: {@link LoginController#createUser(UserDto, HttpSession)}
     */
    @Test
    void testCreateUser2() throws Exception {
        User user = new User();
        user.setAuthorities(new Authorities());
        user.setContactno(1);
        user.setFirstName("Jane");
        user.setId(1);
        user.setLastName("Doe");
        user.setPassword("iloveyou");
        user.setUname("Uname");

        Authorities authorities = new Authorities();
        authorities.setAuthority("JaneDoe");
        authorities.setUname("Uname");
        authorities.setUser(user);

        User user1 = new User();
        user1.setAuthorities(authorities);
        user1.setContactno(1);
        user1.setFirstName("Jane");
        user1.setId(1);
        user1.setLastName("Doe");
        user1.setPassword("iloveyou");
        user1.setUname("Uname");

        Authorities authorities1 = new Authorities();
        authorities1.setAuthority("JaneDoe");
        authorities1.setUname("Uname");
        authorities1.setUser(user1);

        User user2 = new User();
        user2.setAuthorities(authorities1);
        user2.setContactno(1);
        user2.setFirstName("Jane");
        user2.setId(1);
        user2.setLastName("Doe");
        user2.setPassword("iloveyou");
        user2.setUname("Uname");
        when(modelMapper.map((Object) any(), (Class<User>) any())).thenReturn(user2);

        User user3 = new User();
        user3.setAuthorities(new Authorities());
        user3.setContactno(1);
        user3.setFirstName("Jane");
        user3.setId(1);
        user3.setLastName("Doe");
        user3.setPassword("iloveyou");
        user3.setUname("Uname");

        Authorities authorities2 = new Authorities();
        authorities2.setAuthority("JaneDoe");
        authorities2.setUname("Uname");
        authorities2.setUser(user3);

        User user4 = new User();
        user4.setAuthorities(authorities2);
        user4.setContactno(1);
        user4.setFirstName("Jane");
        user4.setId(1);
        user4.setLastName("Doe");
        user4.setPassword("iloveyou");
        user4.setUname("Uname");

        Authorities authorities3 = new Authorities();
        authorities3.setAuthority("JaneDoe");
        authorities3.setUname("Uname");
        authorities3.setUser(user4);

        User user5 = new User();
        user5.setAuthorities(authorities3);
        user5.setContactno(1);
        user5.setFirstName("Jane");
        user5.setId(1);
        user5.setLastName("Doe");
        user5.setPassword("iloveyou");
        user5.setUname("Uname");
        when(userService.existsUserByUname((String) any())).thenReturn(false);
        when(userService.insert((User) any())).thenReturn(user5);
        when(passwordEncoder.encode((CharSequence) any())).thenReturn("secret");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/signUp");
        MockMvcBuilders.standaloneSetup(loginController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("userDto"))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/login"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/login"));
    }

    /**
     * Method under test: {@link LoginController#index()}
     */
    @Test
    void testIndex() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");
        MockMvcBuilders.standaloneSetup(loginController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }

    /**
     * Method under test: {@link LoginController#index()}
     */
    @Test
    void testIndex2() throws Exception {
        User user = new User();
        user.setAuthorities(new Authorities());
        user.setContactno(1);
        user.setFirstName("Jane");
        user.setId(1);
        user.setLastName("Doe");
        user.setPassword("iloveyou");
        user.setUname("Uname");

        Authorities authorities = new Authorities();
        authorities.setAuthority("JaneDoe");
        authorities.setUname("Uname");
        authorities.setUser(user);

        User user1 = new User();
        user1.setAuthorities(authorities);
        user1.setContactno(1);
        user1.setFirstName("Jane");
        user1.setId(1);
        user1.setLastName("Doe");
        user1.setPassword("iloveyou");
        user1.setUname("Uname");

        Authorities authorities1 = new Authorities();
        authorities1.setAuthority("JaneDoe");
        authorities1.setUname("Uname");
        authorities1.setUser(user1);

        User user2 = new User();
        user2.setAuthorities(authorities1);
        user2.setContactno(1);
        user2.setFirstName("Jane");
        user2.setId(1);
        user2.setLastName("Doe");
        user2.setPassword("iloveyou");
        user2.setUname("Uname");
        when(userRepo.findByUname((String) any())).thenReturn(user2);
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/");
        getResult.principal(new UserPrincipal("principal"));
        MockMvcBuilders.standaloneSetup(loginController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("user"))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }

    /**
     * Method under test: {@link LoginController#register()}
     */
    @Test
    void testRegister() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/signUp");
        MockMvcBuilders.standaloneSetup(loginController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("login"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("login"));
    }

    /**
     * Method under test: {@link LoginController#register()}
     */
    @Test
    void testRegister2() throws Exception {
        User user = new User();
        user.setAuthorities(new Authorities());
        user.setContactno(1);
        user.setFirstName("Jane");
        user.setId(1);
        user.setLastName("Doe");
        user.setPassword("iloveyou");
        user.setUname("Uname");

        Authorities authorities = new Authorities();
        authorities.setAuthority("JaneDoe");
        authorities.setUname("Uname");
        authorities.setUser(user);

        User user1 = new User();
        user1.setAuthorities(authorities);
        user1.setContactno(1);
        user1.setFirstName("Jane");
        user1.setId(1);
        user1.setLastName("Doe");
        user1.setPassword("iloveyou");
        user1.setUname("Uname");

        Authorities authorities1 = new Authorities();
        authorities1.setAuthority("JaneDoe");
        authorities1.setUname("Uname");
        authorities1.setUser(user1);

        User user2 = new User();
        user2.setAuthorities(authorities1);
        user2.setContactno(1);
        user2.setFirstName("Jane");
        user2.setId(1);
        user2.setLastName("Doe");
        user2.setPassword("iloveyou");
        user2.setUname("Uname");
        when(userRepo.findByUname((String) any())).thenReturn(user2);
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/signUp");
        getResult.principal(new UserPrincipal("principal"));
        MockMvcBuilders.standaloneSetup(loginController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("user"))
                .andExpect(MockMvcResultMatchers.view().name("login"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("login"));
    }
}

