package com.training.transportcomany2.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.training.transportcomany2.model.Authorities;
import com.training.transportcomany2.model.User;
import org.junit.jupiter.api.Test;

class AuthoritiesDtoTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link AuthoritiesDto#AuthoritiesDto()}
     *   <li>{@link AuthoritiesDto#setAuthority(String)}
     *   <li>{@link AuthoritiesDto#setUname(String)}
     *   <li>{@link AuthoritiesDto#setUser(User)}
     *   <li>{@link AuthoritiesDto#getAuthority()}
     *   <li>{@link AuthoritiesDto#getUname()}
     *   <li>{@link AuthoritiesDto#getUser()}
     * </ul>
     */
    @Test
    void testConstructor() {
        AuthoritiesDto actualAuthoritiesDto = new AuthoritiesDto();
        actualAuthoritiesDto.setAuthority("JaneDoe");
        actualAuthoritiesDto.setUname("Uname");
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
        actualAuthoritiesDto.setUser(user1);
        assertEquals("JaneDoe", actualAuthoritiesDto.getAuthority());
        assertEquals("Uname", actualAuthoritiesDto.getUname());
        assertSame(user1, actualAuthoritiesDto.getUser());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link AuthoritiesDto#AuthoritiesDto(String, String, User)}
     *   <li>{@link AuthoritiesDto#setAuthority(String)}
     *   <li>{@link AuthoritiesDto#setUname(String)}
     *   <li>{@link AuthoritiesDto#setUser(User)}
     *   <li>{@link AuthoritiesDto#getAuthority()}
     *   <li>{@link AuthoritiesDto#getUname()}
     *   <li>{@link AuthoritiesDto#getUser()}
     * </ul>
     */
    @Test
    void testConstructor2() {
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
        AuthoritiesDto actualAuthoritiesDto = new AuthoritiesDto("Uname", "JaneDoe", user1);
        actualAuthoritiesDto.setAuthority("JaneDoe");
        actualAuthoritiesDto.setUname("Uname");
        Authorities authorities2 = new Authorities();
        authorities2.setAuthority("JaneDoe");
        authorities2.setUname("Uname");
        authorities2.setUser(new User());
        User user2 = new User();
        user2.setAuthorities(authorities2);
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
        actualAuthoritiesDto.setUser(user3);
        assertEquals("JaneDoe", actualAuthoritiesDto.getAuthority());
        assertEquals("Uname", actualAuthoritiesDto.getUname());
        assertSame(user3, actualAuthoritiesDto.getUser());
    }
}

