package com.training.transportcomany2.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class UserTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link User#User()}
     *   <li>{@link User#setAuthorities(Authorities)}
     *   <li>{@link User#setContactno(int)}
     *   <li>{@link User#setFirstName(String)}
     *   <li>{@link User#setId(int)}
     *   <li>{@link User#setLastName(String)}
     *   <li>{@link User#setPassword(String)}
     *   <li>{@link User#setUname(String)}
     *   <li>{@link User#toString()}
     *   <li>{@link User#getAuthorities()}
     *   <li>{@link User#getContactno()}
     *   <li>{@link User#getFirstName()}
     *   <li>{@link User#getId()}
     *   <li>{@link User#getLastName()}
     *   <li>{@link User#getPassword()}
     *   <li>{@link User#getUname()}
     * </ul>
     */
    @Test
    void testConstructor() {
        User actualUser = new User();
        User user = new User();
        Authorities authorities = new Authorities();
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
        actualUser.setAuthorities(authorities2);
        actualUser.setContactno(1);
        actualUser.setFirstName("Jane");
        actualUser.setId(1);
        actualUser.setLastName("Doe");
        actualUser.setPassword("iloveyou");
        actualUser.setUname("Uname");
        String actualToStringResult = actualUser.toString();
        Authorities authorities3 = actualUser.getAuthorities();
        assertSame(authorities2, authorities3);
        User user2 = authorities3.getUser();
        Authorities authorities4 = user2.getAuthorities();
        assertSame(authorities1, authorities4);
        User user3 = authorities4.getUser();
        assertSame(authorities, user3.getAuthorities());
        assertEquals(1, actualUser.getContactno());
        assertEquals(1, user2.getContactno());
        assertEquals(1, user3.getContactno());
        assertEquals("Jane", actualUser.getFirstName());
        assertEquals("Jane", user2.getFirstName());
        assertEquals("Jane", user3.getFirstName());
        assertEquals(1, actualUser.getId());
        assertEquals(1, user2.getId());
        assertEquals(1, user3.getId());
        assertEquals("Doe", actualUser.getLastName());
        assertEquals("Doe", user2.getLastName());
        assertEquals("Doe", user3.getLastName());
        assertEquals("iloveyou", actualUser.getPassword());
        assertEquals("iloveyou", user2.getPassword());
        assertEquals("iloveyou", user3.getPassword());
        assertEquals("Uname", actualUser.getUname());
        assertEquals("Uname", user2.getUname());
        assertEquals("Uname", user3.getUname());
        assertEquals("User [id=1, FirstName=Jane, LastName=Doe, uname=Uname, password=iloveyou, contactno=1]",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link User#User(int, String, String, String, String, int)}
     *   <li>{@link User#User()}
     *   <li>{@link User#setAuthorities(Authorities)}
     *   <li>{@link User#setContactno(int)}
     *   <li>{@link User#setFirstName(String)}
     *   <li>{@link User#setId(int)}
     *   <li>{@link User#setLastName(String)}
     *   <li>{@link User#setPassword(String)}
     *   <li>{@link User#setUname(String)}
     *   <li>{@link User#toString()}
     *   <li>{@link User#getAuthorities()}
     *   <li>{@link User#getContactno()}
     *   <li>{@link User#getFirstName()}
     *   <li>{@link User#getId()}
     *   <li>{@link User#getLastName()}
     *   <li>{@link User#getPassword()}
     *   <li>{@link User#getUname()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        User actualUser = new User(1, "Jane", "Doe", "Uname", "iloveyou", 1);
        User user = new User();
        Authorities authorities = new Authorities();
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
        actualUser.setAuthorities(authorities2);
        actualUser.setContactno(1);
        actualUser.setFirstName("Jane");
        actualUser.setId(1);
        actualUser.setLastName("Doe");
        actualUser.setPassword("iloveyou");
        actualUser.setUname("Uname");
        String actualToStringResult = actualUser.toString();
        Authorities authorities3 = actualUser.getAuthorities();
        assertSame(authorities2, authorities3);
        User user2 = authorities3.getUser();
        Authorities authorities4 = user2.getAuthorities();
        assertSame(authorities1, authorities4);
        User user3 = authorities4.getUser();
        assertSame(authorities, user3.getAuthorities());
        assertEquals(1, actualUser.getContactno());
        assertEquals(1, user2.getContactno());
        assertEquals(1, user3.getContactno());
        assertEquals("Jane", actualUser.getFirstName());
        assertEquals("Jane", user2.getFirstName());
        assertEquals("Jane", user3.getFirstName());
        assertEquals(1, actualUser.getId());
        assertEquals(1, user2.getId());
        assertEquals(1, user3.getId());
        assertEquals("Doe", actualUser.getLastName());
        assertEquals("Doe", user2.getLastName());
        assertEquals("Doe", user3.getLastName());
        assertEquals("iloveyou", actualUser.getPassword());
        assertEquals("iloveyou", user2.getPassword());
        assertEquals("iloveyou", user3.getPassword());
        assertEquals("Uname", actualUser.getUname());
        assertEquals("Uname", user2.getUname());
        assertEquals("Uname", user3.getUname());
        assertEquals("User [id=1, FirstName=Jane, LastName=Doe, uname=Uname, password=iloveyou, contactno=1]",
                actualToStringResult);
    }
}

