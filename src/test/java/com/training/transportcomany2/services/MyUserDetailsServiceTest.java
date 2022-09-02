package com.training.transportcomany2.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.training.transportcomany2.model.Authorities;
import com.training.transportcomany2.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {MyUserDetailsService.class})
@ExtendWith(SpringExtension.class)
class MyUserDetailsServiceTest {
    @MockBean
    private AuthorityService authorityService;

    @Autowired
    private MyUserDetailsService myUserDetailsService;

    @MockBean
    private UserService userService;

    /**
     * Method under test: {@link MyUserDetailsService#loadUserByUsername(String)}
     */
    @Test
    void testLoadUserByUsername() throws UsernameNotFoundException {
        Authorities authorities = new Authorities();
        authorities.setAuthority("JaneDoe");
        authorities.setUname("Uname");
        authorities.setUser(new User());

        User user = new User();
        user.setAuthorities(authorities);
        user.setContactno(1);
        user.setFirstName("Jane");
        user.setId(1);
        user.setLastName("Doe");
        user.setPassword("iloveyou");
        user.setUname("Uname");

        Authorities authorities1 = new Authorities();
        authorities1.setAuthority("JaneDoe");
        authorities1.setUname("Uname");
        authorities1.setUser(user);

        User user1 = new User();
        user1.setAuthorities(authorities1);
        user1.setContactno(1);
        user1.setFirstName("Jane");
        user1.setId(1);
        user1.setLastName("Doe");
        user1.setPassword("iloveyou");
        user1.setUname("Uname");

        Authorities authorities2 = new Authorities();
        authorities2.setAuthority("JaneDoe");
        authorities2.setUname("Uname");
        authorities2.setUser(user1);
        when(authorityService.findAuthority(anyInt())).thenReturn(authorities2);

        User user2 = new User();
        user2.setAuthorities(new Authorities());
        user2.setContactno(1);
        user2.setFirstName("Jane");
        user2.setId(1);
        user2.setLastName("Doe");
        user2.setPassword("iloveyou");
        user2.setUname("Uname");

        Authorities authorities3 = new Authorities();
        authorities3.setAuthority("JaneDoe");
        authorities3.setUname("Uname");
        authorities3.setUser(user2);

        User user3 = new User();
        user3.setAuthorities(authorities3);
        user3.setContactno(1);
        user3.setFirstName("Jane");
        user3.setId(1);
        user3.setLastName("Doe");
        user3.setPassword("iloveyou");
        user3.setUname("Uname");

        Authorities authorities4 = new Authorities();
        authorities4.setAuthority("JaneDoe");
        authorities4.setUname("Uname");
        authorities4.setUser(user3);

        User user4 = new User();
        user4.setAuthorities(authorities4);
        user4.setContactno(1);
        user4.setFirstName("Jane");
        user4.setId(1);
        user4.setLastName("Doe");
        user4.setPassword("iloveyou");
        user4.setUname("Uname");
        when(userService.findUserByUname((String) any())).thenReturn(user4);
        UserDetails actualLoadUserByUsernameResult = myUserDetailsService.loadUserByUsername("janedoe");
        assertEquals(1, actualLoadUserByUsernameResult.getAuthorities().size());
        assertEquals("iloveyou", actualLoadUserByUsernameResult.getPassword());
        assertEquals("Uname", actualLoadUserByUsernameResult.getUsername());
        verify(authorityService).findAuthority(anyInt());
        verify(userService).findUserByUname((String) any());
    }

    /**
     * Method under test: {@link MyUserDetailsService#loadUserByUsername(String)}
     */
    @Test
    void testLoadUserByUsername2() throws UsernameNotFoundException {
        when(authorityService.findAuthority(anyInt())).thenThrow(new UsernameNotFoundException("Msg"));

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
        when(userService.findUserByUname((String) any())).thenReturn(user2);
        assertThrows(UsernameNotFoundException.class, () -> myUserDetailsService.loadUserByUsername("janedoe"));
        verify(authorityService).findAuthority(anyInt());
        verify(userService).findUserByUname((String) any());
    }
}

