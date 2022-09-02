package com.training.transportcomany2.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.security.core.GrantedAuthority;

class MyUserDetailsTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MyUserDetails#MyUserDetails()}
     *   <li>{@link MyUserDetails#getPassword()}
     *   <li>{@link MyUserDetails#getUsername()}
     *   <li>{@link MyUserDetails#isAccountNonExpired()}
     *   <li>{@link MyUserDetails#isAccountNonLocked()}
     *   <li>{@link MyUserDetails#isCredentialsNonExpired()}
     *   <li>{@link MyUserDetails#isEnabled()}
     * </ul>
     */
    @Test
    void testConstructor() {
        MyUserDetails actualMyUserDetails = new MyUserDetails();
        assertNull(actualMyUserDetails.getPassword());
        assertNull(actualMyUserDetails.getUsername());
        assertTrue(actualMyUserDetails.isAccountNonExpired());
        assertTrue(actualMyUserDetails.isAccountNonLocked());
        assertTrue(actualMyUserDetails.isCredentialsNonExpired());
        assertTrue(actualMyUserDetails.isEnabled());
    }

    /**
     * Method under test: {@link MyUserDetails#MyUserDetails(User, Authorities)}
     */
    @Test
    void testConstructor2() {
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

        Authorities authorities2 = new Authorities();
        authorities2.setAuthority("JaneDoe");
        authorities2.setUname("Uname");
        authorities2.setUser(new User());

        User user3 = new User();
        user3.setAuthorities(authorities2);
        user3.setContactno(1);
        user3.setFirstName("Jane");
        user3.setId(1);
        user3.setLastName("Doe");
        user3.setPassword("iloveyou");
        user3.setUname("Uname");

        Authorities authorities3 = new Authorities();
        authorities3.setAuthority("JaneDoe");
        authorities3.setUname("Uname");
        authorities3.setUser(user3);

        User user4 = new User();
        user4.setAuthorities(authorities3);
        user4.setContactno(1);
        user4.setFirstName("Jane");
        user4.setId(1);
        user4.setLastName("Doe");
        user4.setPassword("iloveyou");
        user4.setUname("Uname");

        Authorities authorities4 = new Authorities();
        authorities4.setAuthority("JaneDoe");
        authorities4.setUname("Uname");
        authorities4.setUser(user4);
        MyUserDetails actualMyUserDetails = new MyUserDetails(user2, authorities4);

        assertEquals(1, actualMyUserDetails.getAuthorities().size());
        assertEquals("iloveyou", actualMyUserDetails.getPassword());
        assertEquals("Uname", actualMyUserDetails.getUsername());
    }

    /**
     * Method under test: {@link MyUserDetails#getAuthorities()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAuthorities() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: A granted authority textual representation is required
        //       at org.springframework.util.Assert.hasText(Assert.java:289)
        //       at org.springframework.security.core.authority.SimpleGrantedAuthority.<init>(SimpleGrantedAuthority.java:39)
        //       at com.training.transportcomany2.model.MyUserDetails.getAuthorities(MyUserDetails.java:30)
        //   In order to prevent getAuthorities()
        //   from throwing IllegalArgumentException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getAuthorities().
        //   See https://diff.blue/R013 to resolve this issue.

        (new MyUserDetails()).getAuthorities();
    }

    /**
     * Method under test: {@link MyUserDetails#getAuthorities()}
     */
    @Test
    void testGetAuthorities2() {
        User user = new User();
        Collection<? extends GrantedAuthority> actualAuthorities = (new MyUserDetails(user,
                new Authorities("Uname", "JaneDoe"))).getAuthorities();
        assertEquals(1, actualAuthorities.size());
        assertEquals("JANEDOE", ((List<? extends GrantedAuthority>) actualAuthorities).get(0).getAuthority());
    }
}

