package com.training.transportcomany2.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class AuthoritiesTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Authorities#Authorities()}
     *   <li>{@link Authorities#setAuthority(String)}
     *   <li>{@link Authorities#setUname(String)}
     *   <li>{@link Authorities#setUser(User)}
     *   <li>{@link Authorities#getAuthority()}
     *   <li>{@link Authorities#getUser()}
     *   <li>{@link Authorities#getUname()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Authorities actualAuthorities = new Authorities();
        actualAuthorities.setAuthority("JaneDoe");
        actualAuthorities.setUname("Uname");
        Authorities authorities = new Authorities();
        authorities.setAuthority("JaneDoe");
        authorities.setUname("Uname");
        User user = new User();
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
        actualAuthorities.setUser(user2);
        assertEquals("JaneDoe", actualAuthorities.getAuthority());
        User user3 = actualAuthorities.getUser();
        Authorities authorities2 = user3.getAuthorities();
        assertEquals("JaneDoe", authorities2.getAuthority());
        User user4 = authorities2.getUser();
        Authorities authorities3 = user4.getAuthorities();
        assertEquals("JaneDoe", authorities3.getAuthority());
        assertEquals("Uname", actualAuthorities.getUname());
        assertEquals("Uname", authorities2.getUname());
        assertEquals("Uname", authorities3.getUname());
        assertSame(user2, user3);
        assertSame(user1, user4);
        assertSame(user, authorities3.getUser());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Authorities#Authorities(String, String)}
     *   <li>{@link Authorities#setAuthority(String)}
     *   <li>{@link Authorities#setUname(String)}
     *   <li>{@link Authorities#Authorities()}
     *   <li>{@link Authorities#setUser(User)}
     *   <li>{@link Authorities#getAuthority()}
     *   <li>{@link Authorities#getUser()}
     *   <li>{@link Authorities#getUname()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Authorities actualAuthorities = new Authorities("Uname", "JaneDoe");
        actualAuthorities.setAuthority("JaneDoe");
        actualAuthorities.setUname("Uname");
        Authorities authorities = new Authorities();
        authorities.setAuthority("JaneDoe");
        authorities.setUname("Uname");
        User user = new User();
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
        actualAuthorities.setUser(user2);
        assertEquals("JaneDoe", actualAuthorities.getAuthority());
        User user3 = actualAuthorities.getUser();
        Authorities authorities2 = user3.getAuthorities();
        assertEquals("JaneDoe", authorities2.getAuthority());
        User user4 = authorities2.getUser();
        Authorities authorities3 = user4.getAuthorities();
        assertEquals("JaneDoe", authorities3.getAuthority());
        assertEquals("Uname", actualAuthorities.getUname());
        assertEquals("Uname", authorities2.getUname());
        assertEquals("Uname", authorities3.getUname());
        assertSame(user2, user3);
        assertSame(user1, user4);
        assertSame(user, authorities3.getUser());
    }
}

